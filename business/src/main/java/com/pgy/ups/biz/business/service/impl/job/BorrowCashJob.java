package com.pgy.ups.biz.business.service.impl.job;

import com.pgy.ups.biz.business.core.utils.SpringContextHelper;
import com.pgy.ups.biz.commom.date.DateUtils;
import com.pgy.ups.biz.facade.service.BorrowCashService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;


public class BorrowCashJob  implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        BorrowCashService borrowCashService =  (BorrowCashService)SpringContextHelper.getBean("borrowCashServiceImpl");
        borrowCashService.accountCheck(DateUtils.getDaySubtract(new Date(),1));
    }
}
