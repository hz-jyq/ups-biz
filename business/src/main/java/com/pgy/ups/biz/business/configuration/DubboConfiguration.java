package com.pgy.ups.biz.business.configuration;

import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@Configuration
@DubboComponentScan("com.pgy.ups")
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
    public ConsumerConfig consumerConfig(DubboProperties dubboProperties) {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(120000);
		consumerConfig.setRetries(new Integer("0"));
		consumerConfig.setCheck(false);
        return consumerConfig;
    }


    @Bean
	public RegistryConfig registryConfig(DubboProperties dubboProperties) {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(dubboProperties.getAddress());
		registryConfig.setClient(dubboProperties.getZkClient());
        registryConfig.setPort(-1);
		return registryConfig;
	}

    @Bean
    public ProtocolConfig ProtocolConfig(DubboProperties dubboProperties) {
        ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setPort(-1);
        return protocolConfig;
    }
}
