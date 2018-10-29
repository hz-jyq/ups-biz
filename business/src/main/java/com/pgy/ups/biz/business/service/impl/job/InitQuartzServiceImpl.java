package com.pgy.ups.biz.business.service.impl.job;

import com.pgy.ups.biz.commom.job.QuartzManager;
import com.pgy.ups.biz.facade.model.sysCronJob.SysCronJob;
import com.pgy.ups.biz.facade.service.InitQuartzService;
import com.pgy.ups.biz.facade.service.SysCronJobService;
import org.quartz.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class InitQuartzServiceImpl implements InitQuartzService {

    @Resource
    private SysCronJobService sysCronJobService;

    public void runInitQuartz(){
        Map<String, Object> paramMap = new HashMap<>();
        SysCronJob payForJob =  sysCronJobService.getSysCronByBeanId("upsPayFor");
        paramMap.put("code",payForJob.getId());
        if(payForJob != null)QuartzManager.addJob(paramMap,"payFor",BorrowCashJob.class,payForJob.getCron());
        SysCronJob withholdJob =  sysCronJobService.getSysCronByBeanId("upsWithhold");
        paramMap.put("code",payForJob.getId());
        if(withholdJob != null) QuartzManager.addJob(paramMap,"withhold",RepaymentBorrowCashJob.class,withholdJob.getCron());
    }
}
