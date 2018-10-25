package com.pgy.ups.biz.business.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix= SystemProperties.SYSTEM_PREFIX)
public class SystemProperties {
    public static final String SYSTEM_PREFIX = "system";

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
