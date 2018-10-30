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
import com.pgy.ups.biz.facade.model.sysCronJob.SysCronJob;
import com.pgy.ups.biz.facade.model.upsCheckAccounts.UpsCheckAccounts;
import com.pgy.ups.biz.facade.model.upsCheckAccountsRecord.UpsCheckAccountsRecord;
import com.pgy.ups.biz.facade.service.RenewalDetailService;
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

    @Autowired
    private SysCronJobService sysCronJobService;

    public  static   String typeReturn= ProofreadAccountType.RETURN;

    private Logger logger = LoggerFactory.getLogger(RepaymentBorrowCashServiceImpl.class);


    @Override
    public List<LsdRepaymentBorrowCash> getEverydayList(Date date) {
        return repaymentBorrowCashMapper.getEverydayList(DateUtils.getStartOfDay(date),DateUtils.getEndOfDay(date));
    }

    @Override
    public void accountCheck(Date date) {
        SysCronJob sysCronJob =  sysCronJobService.getSysCronByBeanId("upsWithhold");
        if(sysCronJob == null || !sysCronJob.getIsOpen().toString().equals("0")){
            return;
        }
        String strDate =  DateUtils.getDateForString(date);
        logger.info("运行每日代扣对账{}",strDate);
        UpsCheckAccounts upsCheckAccounts = upsCheckAccountsService.getRecordTypeAndYmd(typeReturn,strDate,true);
        if(upsCheckAccounts != null){
            logger.info("每日代扣对账已经成功不在运行");
            return;
        }
        List<LsdRenewalDetail> renewalDetailList =  renewalDetailService.getEverydayList(date);
        List<LsdRepaymentBorrowCash>  lsdRepaymentBorrowCashList  =  getEverydayList(date);
        List<BusinessProofreadModel>  list =   getModelList(renewalDetailList,lsdRepaymentBorrowCashList);
        logger.info("每日代付对账ProofreadResult传参ststem:{},type:{},date:{}",systemProperties.getCode(),typeReturn,date);
        ProofreadResult result = proofreadAccountApi.ProofreadStart(list, systemProperties.getCode(), typeReturn,date);
        if(result == null){
            logger.error("每日代扣对账ProofreadResult返回为null");
            return;
        }
        logger.info("代扣ProofreadResult返回的结果{}",result.toString());
        saveResult(result,strDate,typeReturn);
        logger.info("每日代扣结束");
    }

        private List<BusinessProofreadModel> getModelList(List<LsdRenewalDetail> renewalDetailList,List<LsdRepaymentBorrowCash>  lsdRepaymentBorrowCashList){
            List<BusinessProofreadModel> proofreadModelList = new ArrayList<BusinessProofreadModel>();
            for( LsdRenewalDetail detail : renewalDetailList){
                BusinessProofreadModel model = new BusinessProofreadModel();
                model.setOrderCreateTime(DateUtils.getSimpleDateFormatYmdHms(detail.getGmtCreate()));
                model.setProofreadDate(DateUtils.getSimpleDateFormatYmdHms(new Date()));
                model.setBorrowNum(detail.getBorrowNo());
                model.setExchangeAmount(detail.getActualAmount());
                model.setBusinessOrderStatuts(detail.getStatus().toString());
                model.setBusinessOrderNum(detail.getTradeNo());
                model.setBorrowNum(detail.getBorrowNo());
                proofreadModelList.add(model);
            }
            for( LsdRepaymentBorrowCash repaymentBorrowCash : lsdRepaymentBorrowCashList){
                BusinessProofreadModel model = new BusinessProofreadModel();
                model.setOrderCreateTime(DateUtils.getSimpleDateFormatYmdHms(repaymentBorrowCash.getGmtCreate()));
                model.setProofreadDate(DateUtils.getSimpleDateFormatYmdHms(new Date()));
                model.setBorrowNum(repaymentBorrowCash.getBorrowNo());
                model.setBusinessOrderNum(repaymentBorrowCash.getBorrowNo());
                model.setExchangeAmount(repaymentBorrowCash.getActualAmount());
                model.setBusinessOrderStatuts(repaymentBorrowCash.getStatus().toString());
                model.setBusinessOrderNum(repaymentBorrowCash.getTradeNo());
                proofreadModelList.add(model);
            }
        return  proofreadModelList;
    }


    @Override
    public void saveResult(ProofreadResult result,String strDate,String type){
        logger.info("saveResult参数proofreadType:{},strDate:{},type{}",result.getProofreadType(),strDate,type);
        UpsCheckAccounts upsCheckAccounts = upsCheckAccountsService.getRecordTypeAndYmd(type,strDate,null);
        if(upsCheckAccounts == null){
            upsCheckAccounts = new UpsCheckAccounts();
            upsCheckAccounts.setGmtCreate(new Date());
            upsCheckAccounts.setGmtModified(new Date());
            upsCheckAccounts.setReturnCode(result.getSuccess());
            upsCheckAccounts.setYmd(strDate);
            upsCheckAccounts.setProofreadType(result.getProofreadType());
            upsCheckAccounts.setFromSystem(result.getFromSystem());
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
        record.setProofreadType(result.getProofreadType());
        UpsCheckAccountsRecordMapper.insertSelective(record);
    }
}
