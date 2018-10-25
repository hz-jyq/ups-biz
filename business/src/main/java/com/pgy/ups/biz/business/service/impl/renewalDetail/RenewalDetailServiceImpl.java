package com.pgy.ups.biz.business.service.impl.renewalDetail;

import com.pgy.ups.biz.business.dao.mapper.renewalDetail.LsdRenewalDetailMapper;
import com.pgy.ups.biz.commom.date.DateUtils;
import com.pgy.ups.biz.facade.model.renewalDetail.LsdRenewalDetail;
import com.pgy.ups.biz.facade.service.RenewalDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class RenewalDetailServiceImpl implements RenewalDetailService{


    @Resource
    private LsdRenewalDetailMapper  lsdRenewalDetailMapper;

    @Override
    public List<LsdRenewalDetail> getEverydayList(Date date) {
        return lsdRenewalDetailMapper.getEverydayList(DateUtils.getStartOfDay(date),DateUtils.getEndOfDay(date));
    }



}
