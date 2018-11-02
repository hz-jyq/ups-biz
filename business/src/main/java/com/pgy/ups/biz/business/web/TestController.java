package com.pgy.ups.biz.business.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

   @GetMapping
    public Map test(){
        HashMap map = new HashMap();
        map.put("1","2");
        return map;
    }
}
