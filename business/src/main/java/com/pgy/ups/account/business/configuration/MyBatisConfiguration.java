package com.pgy.ups.account.business.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;

@Configuration
@MapperScan("com.pgy.ups.account.business.dao.mapper")
public class MyBatisConfiguration {
	@Bean
    public PaginationInterceptor paginationInterceptor() {
        // mybatis-plus分页插件
        PaginationInterceptor interceptor = new PaginationInterceptor();
        interceptor.setLocalPage(true);
        interceptor.setDialectType("mysql");
        return interceptor;
    }
}
