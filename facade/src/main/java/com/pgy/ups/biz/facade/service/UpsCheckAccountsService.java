package com.pgy.ups.biz.facade.service;

import com.pgy.ups.biz.facade.model.upsCheckAccounts.UpsCheckAccounts;

public interface UpsCheckAccountsService {

    void updateByPrimaryKeySelective(UpsCheckAccounts record);

    UpsCheckAccounts  getRecordTypeAndYmd(String type,String ymd,Boolean flag);

    void  insertSelective(UpsCheckAccounts record);
}
