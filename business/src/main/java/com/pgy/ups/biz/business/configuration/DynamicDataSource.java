package com.pgy.ups.biz.business.configuration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

@Component
public class DynamicDataSource extends AbstractRoutingDataSource  {

    private Logger logger = LoggerFactory.getLogger(DynamicDataSource.class);

    @Override
    protected Object determineCurrentLookupKey() {
        HandlerDataSource.DatabaseType databaseType  = HandlerDataSource.getType();
        logger.info("当前线程数据源----------------:{}", databaseType.name());
        HandlerDataSource.clearDataSource();
        return databaseType;
    }
}
