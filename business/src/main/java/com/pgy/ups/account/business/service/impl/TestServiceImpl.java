package com.pgy.ups.account.business.service.impl;

import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import com.pay.ups.account.facade.api.TestService;
import com.pay.ups.account.facade.from.Form;
import com.pay.ups.account.facade.model.AuthSignConfig;
import com.pgy.ups.account.business.dao.mapper.AuthSignConfigMapper;
import com.alibaba.dubbo.config.annotation.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    AuthSignConfigMapper authSignConfigMapper;

   @Override
    public void test() {
        Form base = new Form();
        List<AuthSignConfig> list = authSignConfigMapper.selectPage(base.enablePaging());
        Pagination pagination = PageHelper.getPagination();
    }
}
