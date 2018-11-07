package com.pgy.ups.biz.business.service.impl.upsCheckAccounts;

import com.pgy.ups.biz.business.aop.DataSoureSelect;
import com.pgy.ups.biz.business.configuration.HandlerDataSource;
import com.pgy.ups.biz.business.dao.mapper.upsCheckAccounts.UpsCheckAccountsMapper;
import com.pgy.ups.biz.facade.model.upsCheckAccounts.UpsCheckAccounts;
import com.pgy.ups.biz.facade.service.UpsCheckAccountsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UpsCheckAccountsServiceImpl implements UpsCheckAccountsService {


    @Resource
    private UpsCheckAccountsMapper upsCheckAccountsMapper;


    @Override
   public   void updateByPrimaryKeySelective(UpsCheckAccounts record){
        upsCheckAccountsMapper.updateByPrimaryKeySelective(record);
    }


    @Override
   // @Master
    public UpsCheckAccounts  getRecordTypeAndYmd(String proofreadType,String ymd,Boolean flag){
      return  upsCheckAccountsMapper.getRecordTypeAndYmd(proofreadType,ymd,flag);
    }

    @Override
    public void insertSelective(UpsCheckAccounts record) {
        upsCheckAccountsMapper.insertSelective(record);
    }

    @Override
    @DataSoureSelect(value = HandlerDataSource.DatabaseType.Slave)
    public UpsCheckAccounts getRecordTypeAndYmd1(String type, String ymd, Boolean flag) {
        return  upsCheckAccountsMapper.getRecordTypeAndYmd(type,ymd,flag);
    }
}
