package com.pgy.ups.biz.business.aop;

import com.pgy.ups.biz.business.configuration.DynamicDataSource;
import com.pgy.ups.biz.business.configuration.HandlerDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(-1)
public class DataSourceAOP implements PriorityOrdered {


    private Logger logger = LoggerFactory.getLogger(DataSourceAOP.class);

    @Before("(@annotation(com.pgy.ups.biz.business.aop.DataSoureSelect))")
    public void setWriteDataSourceType(JoinPoint joinPoint) {
        DataSoureSelect systemLog = ((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(DataSoureSelect.class);
        HandlerDataSource.DatabaseType databaseType  = systemLog.value();
        HandlerDataSource.setDatabaseType(databaseType);
        logger.info("dataSource切换到：{}",databaseType.);
    }

    @Before("(@annotation(com.pgy.ups.biz.business.aop.Slave))")
    public void setReadDataSourceType(){
       HandlerDataSource.slave();
       logger.info("dataSource切换到：slave");
    }


    @Override
    public int getOrder() {
        return 1;
    }
}
