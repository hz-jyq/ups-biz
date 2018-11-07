/**
 *
 */
package com.pgy.ups.biz.business;

import com.alibaba.druid.pool.DruidDataSource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.pgy.ups.biz.facade.service.InitQuartzService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;


/**
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UpsBizApplication {

    @Autowired
    private InitQuartzService initQuartzService;

    private static final Logger logger = LoggerFactory.getLogger(UpsBizApplication.class);

    public static void main(String[] args) {
        logger.info ("begin to start-up [ups-biz]");
        ApplicationContext app = SpringApplication.run(UpsBizApplication.class, args);
      //  SpringContextHelper.setApplicationContext(app);
        logger.info ("start-up [ups-biz] success !!!");
    }


   @PostConstruct
    public void  InitQuartz() {
        initQuartzService.runInitQuartz();
    }

    @Primary
    @Bean(name = "writeDataSource")
    @ConfigurationProperties(prefix  ="spring.datasource")
    public DataSource writeDataSource(){
        return  DruidDataSourceBuilder.create().build();
    }


    @Bean(name = "readDataSource")
    @ConfigurationProperties(prefix  ="spring.multidatasources.slave")
    public DataSource readDataSource(){
        return  DruidDataSourceBuilder.create().build();
    }


}
