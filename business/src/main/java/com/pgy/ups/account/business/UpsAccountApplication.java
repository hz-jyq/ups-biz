/**
 *
 */
package com.pgy.ups.account.business;

import  org.mybatis.spring.annotation.MapperScan;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;


/**
 *
 */
@SpringBootApplication
@EnableSpringConfigured
@ImportResource(locations={"classpath:dubbo.xml"})
public class UpsAccountApplication {
    private static final Logger logger = LoggerFactory.getLogger(UpsAccountApplication.class);

    public static void main(String[] args) {
        logger.info ("begin to start-up [ups-account]");
        SpringApplication.run(UpsAccountApplication.class, args);
        logger.info ("start-up [ups-account] success !!!");
    }



   @Configuration
   @MapperScan("com.pgy.ups.account.business.dao.mapper")
    public static class MybatisPlusConfig {

        @Bean
        public PaginationInterceptor paginationInterceptor() {
            // mybatis-plus分页插件
            PaginationInterceptor interceptor = new PaginationInterceptor();
            interceptor.setLocalPage(true);
            interceptor.setDialectType("mysql");
            return interceptor;
        }
    }


}
