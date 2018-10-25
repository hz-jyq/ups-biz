package com.pgy.ups.biz.facade.service;

import com.pgy.ups.biz.facade.model.renewalDetail.LsdRenewalDetail;

import java.util.Date;
import java.util.List;

public interface RenewalDetailService {

    List<LsdRenewalDetail> getEverydayList(Date date);
}
