package com.pgy.ups.biz.business.service.impl.sysCronJob;

import com.pgy.ups.biz.business.dao.mapper.sysCronJob.SysCronJobMapper;
import com.pgy.ups.biz.facade.model.sysCronJob.SysCronJob;
import com.pgy.ups.biz.facade.service.SysCronJobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysCronJobServiceImpl  implements SysCronJobService {

    @Resource
    private SysCronJobMapper  sysCronJobMapper;


    @Override
    public SysCronJob getSysCronByBeanId(String beanId) {
        return sysCronJobMapper.getSysCronByBeanId(beanId);
    }
}
