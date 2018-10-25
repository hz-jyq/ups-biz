package com.pgy.ups.biz.business.service.impl.repaymentBorrowCash;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pgy.ups.account.facade.constant.ProofreadAccountType;
import com.pgy.ups.account.facade.dubbo.api.ProofreadAccountApi;
import com.pgy.ups.account.facade.model.proofread.BusinessProofreadModel;
import com.pgy.ups.account.facade.model.proofread.ProofreadResult;
import com.pgy.ups.biz.business.configuration.SystemProperties;
import com.pgy.ups.biz.business.dao.mapper.repaymentBorrowCash.LsdRepaymentBorrowCashMapper;
import com.pgy.ups.biz.business.dao.mapper.upsCheckAccountsRecord.UpsCheckAccountsRecordMapper;
import com.pgy.ups.biz.commom.date.DateUtils;
import com.pgy.ups.biz.facade.model.renewalDetail.LsdRenewalDetail;
import com.pgy.ups.biz.facade.model.repaymentBorrowCash.LsdRepaymentBorrowCash;
import com.pgy.ups.biz.facade.model.upsCheckAccounts.UpsCheckAccounts;
import com.pgy.ups.biz.facade.model.upsCheckAccountsRecord.UpsCheckAccountsRecord;
import com.pgy.ups.biz.facade.service.RenewalDetailService;
import com.pgy.ups.biz.facade.service.RepaymentBorrowCashService;
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
public class RepaymentBorrowCashServiceImpl implements RepaymentBorrowCashService{


    @Resource
    private LsdRepaymentBorrowCashMapper repaymentBorrowCashMapper;

    @Resource
    private RenewalDetailService renewalDetailService;

    @Reference
    ProofreadAccountApi proofreadAccountApi;

    @Autowired
    private SystemProperties systemProperties;


    @Autowired
    private UpsCheckAccountsService upsCheckAccountsService;

    @Resource
    private UpsCheckAccountsRecordMapper UpsCheckAccountsRecordMapper;

    private Logger logger = LoggerFactory.getLogger(RepaymentBorrowCashServiceImpl.class);


    @Override
    public List<LsdRepaymentBorrowCash> getEverydayList(Date date) {
        return repaymentBorrowCashMapper.getEverydayList(DateUtils.getStartOfDay(date),DateUtils.getEndOfDay(date));
    }

    @Override
    public void accountCheck(Date date) {
        String strDate =  DateUtils.getDateForString(date);
        logger.info("运行每日代扣对账{}",strDate);
        UpsCheckAccounts upsCheckAccounts = upsCheckAccountsService.getRecordTypeAndYmd(ProofreadAccountType.RETURN,strDate,true);
        if(upsCheckAccounts != null){
            return;
        }
        List<LsdRenewalDetail> renewalDetailList =  renewalDetailService.getEverydayList(date);
        List<LsdRepaymentBorrowCash>  lsdRepaymentBorrowCashList  =  getEverydayList(date);
        List<BusinessProofreadModel>  list =   getModelList(renewalDetailList,lsdRepaymentBorrowCashList);
       // ProofreadResult result = proofreadAccountApi.ProofreadStart(list, systemProperties.getCode(), ProofreadAccountType.RETURN,date);
        ProofreadResult result = new ProofreadResult();
        result.setSuccess(true);
        saveResult(result,strDate,ProofreadAccountType.RETURN);
    }

        private List<BusinessProofreadModel> getModelList(List<LsdRenewalDetail> renewalDetailList,List<LsdRepaymentBorrowCash>  lsdRepaymentBorrowCashList){
            List<BusinessProofreadModel> proofreadModelList = new ArrayList<BusinessProofreadModel>();
            for( LsdRenewalDetail detail : renewalDetailList){
                BusinessProofreadModel model = new BusinessProofreadModel();
                model.setBorrowNum(detail.getBorrowNo());
                model.setExchangeAmount(detail.getActualAmount());
                model.setBussinessOrderStatuts(detail.getStatus().toString());
                model.setBusinessOrderNum(detail.getTradeNo());
                model.setBorrowNum(detail.getBorrowNo());
                proofreadModelList.add(model);
            }
            for( LsdRepaymentBorrowCash repaymentBorrowCash : lsdRepaymentBorrowCashList){
                BusinessProofreadModel model = new BusinessProofreadModel();
                model.setBorrowNum(repaymentBorrowCash.getBorrowNo());
                model.setBusinessOrderNum(repaymentBorrowCash.getBorrowNo());
                model.setExchangeAmount(repaymentBorrowCash.getActualAmount());
                model.setBussinessOrderStatuts(repaymentBorrowCash.getStatus().toString());
                model.setBusinessOrderNum(repaymentBorrowCash.getTradeNo());
                proofreadModelList.add(model);
            }
        return  proofreadModelList;
    }


    @Override
    public void saveResult(ProofreadResult result,String strDate,String type){
        UpsCheckAccounts upsCheckAccounts = upsCheckAccountsService.getRecordTypeAndYmd(type,strDate,null);
        if(upsCheckAccounts == null){
            upsCheckAccounts = new UpsCheckAccounts();
            upsCheckAccounts.setGmtCreate(new Date());
            upsCheckAccounts.setGmtModified(new Date());
            upsCheckAccounts.setReturnCode(result.getSuccess());
            upsCheckAccounts.setYmd(strDate);
            upsCheckAccounts.setReturnCode(result.getSuccess());
            upsCheckAccounts.setProofreadType(type);
            upsCheckAccountsService.insertSelective(upsCheckAccounts);
        }else{
            upsCheckAccounts.setReturnCode(result.getSuccess());
            upsCheckAccounts.setGmtModified(new Date());
            upsCheckAccountsService.updateByPrimaryKeySelective(upsCheckAccounts);
        }
        UpsCheckAccountsRecord record = new UpsCheckAccountsRecord();
        record.setProofreadResultId(result.getId());
        record.setFailReason(result.getFailReason());
        record.setGmtCreate(new Date());
        record.setGmtModified(new Date());
        record.setReturnCode(result.getSuccess());
        record.setYmd(strDate);
        record.setProofreadType(type);
        UpsCheckAccountsRecordMapper.insertSelective(record);
    }
}
