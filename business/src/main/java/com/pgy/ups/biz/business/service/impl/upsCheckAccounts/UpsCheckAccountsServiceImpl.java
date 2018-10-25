package com.pgy.ups.biz.business.service.impl.upsCheckAccounts;

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
    public UpsCheckAccounts  getRecordTypeAndYmd(String proofreadType,String ymd,Boolean flag){
      return  upsCheckAccountsMapper.getRecordTypeAndYmd(proofreadType,ymd,flag);
    }

    @Override
    public void insertSelective(UpsCheckAccounts record) {
        upsCheckAccountsMapper.insertSelective(record);
    }
}
