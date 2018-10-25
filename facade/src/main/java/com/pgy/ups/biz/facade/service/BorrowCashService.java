package com.pgy.ups.biz.facade.service;

import com.pgy.ups.biz.facade.model.borrowCash.LsdBorrowCash;
import com.pgy.ups.biz.facade.model.renewalDetail.LsdRenewalDetail;

import java.util.Date;
import java.util.List;

public interface BorrowCashService {

    List<LsdBorrowCash> getEverydayList(Date date);

    void accountCheck(Date date);
}
