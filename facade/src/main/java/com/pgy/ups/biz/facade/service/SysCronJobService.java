package com.pgy.ups.biz.facade.service;

import com.pgy.ups.biz.facade.model.sysCronJob.SysCronJob;

public interface SysCronJobService {

    SysCronJob getSysCronByBeanId(String beanId);
}
