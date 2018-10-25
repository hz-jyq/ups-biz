package com.pgy.ups.biz.business.service.impl.borrowCash;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pgy.ups.account.facade.constant.ProofreadAccountType;
import com.pgy.ups.account.facade.dubbo.api.ProofreadAccountApi;
import com.pgy.ups.account.facade.model.proofread.BusinessProofreadModel;
import com.pgy.ups.account.facade.model.proofread.ProofreadResult;
import com.pgy.ups.biz.business.configuration.SystemProperties;
import com.pgy.ups.biz.business.dao.mapper.borrowCash.LsdBorrowCashMapper;
import com.pgy.ups.biz.commom.date.DateUtils;
import com.pgy.ups.biz.facade.model.borrowCash.LsdBorrowCash;
import com.pgy.ups.biz.facade.model.upsCheckAccounts.UpsCheckAccounts;
import com.pgy.ups.biz.facade.service.BorrowCashService;
import com.pgy.ups.biz.facade.service.RepaymentBorrowCashService;
import com.pgy.ups.biz.facade.service.UpsCheckAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BorrowCashServiceImpl  implements BorrowCashService {

    @Resource
    private LsdBorrowCashMapper lsdBorrowCashMapper;

    @Reference
    ProofreadAccountApi proofreadAccountApi;

    @Autowired
    private SystemProperties systemProperties;

    @Autowired
    private UpsCheckAccountsService upsCheckAccountsService;

    @Autowired
    private RepaymentBorrowCashService  repaymentBorrowCashService;


    @Override
    public List<LsdBorrowCash> getEverydayList(Date date) {
        return lsdBorrowCashMapper.getEverydayList(DateUtils.getStartOfDay(date),DateUtils.getEndOfDay(date));
    }

    @Override
    public void accountCheck(Date date) {
        String strDate =  DateUtils.getDateForString(date);
        UpsCheckAccounts upsCheckAccounts = upsCheckAccountsService.getRecordTypeAndYmd(ProofreadAccountType.BORROW,strDate,true);
        if(upsCheckAccounts != null){
            return;
        }
        List<LsdBorrowCash>  lsdBorrowCashList  = getEverydayList(date);
        List<BusinessProofreadModel>  list =  getModelList(lsdBorrowCashList);
      //  ProofreadResult result = proofreadAccountApi.ProofreadStart(list, systemProperties.getCode(), ProofreadAccountType.BORROW,date);
        ProofreadResult result = new ProofreadResult();
        result.setSuccess(true);
        repaymentBorrowCashService.saveResult(result,strDate,ProofreadAccountType.BORROW);
    }

    private List<BusinessProofreadModel> getModelList(List<LsdBorrowCash> list ){
        List<BusinessProofreadModel> proofreadModelList = new ArrayList<BusinessProofreadModel>();
        for(LsdBorrowCash lsdBorrowCash : list){
            BusinessProofreadModel model = new BusinessProofreadModel();
            //lsdBorrowCash.getGmtCreate();
          // model.setOrderCreateTime();
            model.setExchangeAmount(lsdBorrowCash.getRepayAmount());
            model.setBorrowNum(lsdBorrowCash.getBorrowNo());
            model.setBussinessOrderStatuts(lsdBorrowCash.getStatus().toString());
            proofreadModelList.add(model);
        }
        return  proofreadModelList;
    }




}
