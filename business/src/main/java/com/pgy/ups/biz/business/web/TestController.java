package com.pgy.ups.biz.business.web;

import com.pgy.ups.biz.facade.model.upsCheckAccounts.UpsCheckAccounts;
import com.pgy.ups.biz.facade.service.UpsCheckAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private  UpsCheckAccountsService upsCheckAccountsService;


   @GetMapping
    public Map test(){
       UpsCheckAccounts  ups = upsCheckAccountsService.getRecordTypeAndYmd("01","20181024",true);
       UpsCheckAccounts  ups1 = upsCheckAccountsService.getRecordTypeAndYmd1("01","20181029",true);
       UpsCheckAccounts  ups2 = upsCheckAccountsService.getRecordTypeAndYmd("01","20181024",true);
        HashMap map = new HashMap();
        map.put("1","2");
        return map;
    }
}
