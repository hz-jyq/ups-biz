package com.pgy.ups.account.business.web.zcaf;

import com.pay.ups.account.facade.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class test {

    @Autowired
    private TestService testService;

   @GetMapping
    public Map test(){
       testService.test();
        HashMap map = new HashMap();
        map.put("1","2");
        return map;
    }
}
