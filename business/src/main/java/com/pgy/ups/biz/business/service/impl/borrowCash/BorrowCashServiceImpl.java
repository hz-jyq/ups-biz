package com.pgy.ups.biz.business.service.impl.borrowCash;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pgy.ups.account.facade.constant.ProofreadAccountType;
import com.pgy.ups.account.facade.dubbo.api.ProofreadAccountApi;
import com.pgy.ups.account.facade.model.proofread.BusinessProofreadModel;
import com.pgy.ups.account.facade.model.proofread.ProofreadResult;
import com.pgy.ups.biz.business.configuration.SystemProperties;
import com.pgy.ups.biz.business.dao.mapper.borrowCash.LsdBorrowCashMapper;
import com.pgy.ups.biz.business.service.impl.repaymentBorrowCash.RepaymentBorrowCashServiceImpl;
import com.pgy.ups.biz.commom.date.DateUtils;
import com.pgy.ups.biz.facade.model.borrowCash.LsdBorrowCash;
import com.pgy.ups.biz.facade.model.sysCronJob.SysCronJob;
import com.pgy.ups.biz.facade.model.upsCheckAccounts.UpsCheckAccounts;
import com.pgy.ups.biz.facade.service.BorrowCashService;
import com.pgy.ups.biz.facade.service.RepaymentBorrowCashService;
import com.pgy.ups.biz.facade.service.SysCronJobService;
import com.pgy.ups.biz.facade.service.UpsCheckAccountsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private SysCronJobService  sysCronJobService;

    @Autowired
    private RepaymentBorrowCashService  repaymentBorrowCashService;

    private Logger logger = LoggerFactory.getLogger(BorrowCashServiceImpl.class);


    @Override
    public List<LsdBorrowCash> getEverydayList(Date date) {
        return lsdBorrowCashMapper.getEverydayList(DateUtils.getStartOfDay(date),DateUtils.getEndOfDay(date));
    }

    @Override
    public void accountCheck(Date date) {
        SysCronJob sysCronJob  = sysCronJobService.getSysCronByBeanId("upsPayFor");
        if(sysCronJob == null || !sysCronJob.getIsOpen().toString().equals("0")){
            return;
        }
        String strDate =  DateUtils.getDateForString(date);
        logger.info("运行每日代付对账{}",strDate);
        UpsCheckAccounts upsCheckAccounts = upsCheckAccountsService.getRecordTypeAndYmd(ProofreadAccountType.BORROW,strDate,true);
        if(upsCheckAccounts != null){
            return;
        }
        List<LsdBorrowCash>  lsdBorrowCashList  = getEverydayList(date);
        List<BusinessProofreadModel>  list =  getModelList(lsdBorrowCashList);
       ProofreadResult result = proofreadAccountApi.ProofreadStart(list, systemProperties.getCode(), ProofreadAccountType.BORROW,date);
        repaymentBorrowCashService.saveResult(result,strDate,ProofreadAccountType.BORROW);
    }

    private List<BusinessProofreadModel> getModelList(List<LsdBorrowCash> list ){
        List<BusinessProofreadModel> proofreadModelList = new ArrayList<BusinessProofreadModel>();
        for(LsdBorrowCash lsdBorrowCash : list){
            BusinessProofreadModel model = new BusinessProofreadModel();
            model.setOrderCreateTime(DateUtils.getSimpleDateFormatYmdHms(lsdBorrowCash.getGmtCreate()));
            model.setProofreadDate(DateUtils.getSimpleDateFormatYmdHms(new Date()));
            model.setExchangeAmount(lsdBorrowCash.getArrivalAmount());
            model.setBorrowNum(lsdBorrowCash.getBorrowNo());
            model.setBusinessOrderNum(lsdBorrowCash.getTradeNo());
            model.setBusinessOrderStatuts(lsdBorrowCash.getStatus().toString());
            proofreadModelList.add(model);
        }
        return  proofreadModelList;
    }




}
