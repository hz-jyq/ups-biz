package com.pgy.ups.biz.business.service.impl.job;

import com.pgy.ups.biz.commom.job.QuartzManager;
import com.pgy.ups.biz.facade.service.InitQuartzService;
import org.quartz.*;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class InitQuartzServiceImpl implements InitQuartzService {

    public void runInitQuartz(){
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("code","1");
        QuartzManager.addJob(paramMap,"payFor",BorrowCashJob.class,"*/30 * * * * ?");
        QuartzManager.addJob(paramMap,"withhold",RepaymentBorrowCashJob.class,"*/30 * * * * ?");
    }
}
