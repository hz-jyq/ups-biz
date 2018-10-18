package com.pgy.ups.account.business.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@Configuration
@DubboComponentScan("com.pgy.ups.account.bussiness.dubbo.api")
public class DubboConfiguration {
    
	@Bean
	public DubboProperties getDubboProperties() {
		return new DubboProperties();
	}
	
	@Bean
	public ApplicationConfig applicationConfig(DubboProperties dubboProperties) {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(dubboProperties.getName());
		applicationConfig.setLogger(dubboProperties.getLogger());
		return applicationConfig;
	}

	@Bean
	public RegistryConfig registryConfig(DubboProperties dubboProperties) {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(dubboProperties.getAddress());
		registryConfig.setClient(dubboProperties.getZkClient());
		return registryConfig;
	}
}
