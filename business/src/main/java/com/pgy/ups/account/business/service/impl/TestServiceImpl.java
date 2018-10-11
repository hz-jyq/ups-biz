package com.pgy.ups.account.business.service.impl;

import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.pay.ups.account.facade.api.TestService;
import com.pay.ups.account.facade.from.Form;
import com.pgy.ups.account.business.dao.domain.AuthSignConfig;
import com.pgy.ups.account.business.dao.mapper.AuthSignConfigMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    AuthSignConfigMapper authSignConfigMapper;

    @Override
    public void test() {
        Form base = new Form();
        PageHelper.startPage(1, 4);
        List<AuthSignConfig> list = authSignConfigMapper.selectPage(null);
       // base.page.setRecords(list);
        Pagination pagination = PageHelper.getPagination();

    }
}
