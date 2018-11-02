/**
 *
 */
package com.pgy.ups.biz.business;

import com.pgy.ups.biz.business.core.utils.SpringContextHelper;
import com.pgy.ups.biz.facade.service.InitQuartzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


import javax.annotation.PostConstruct;

/**
 *
 */
@SpringBootApplication
public class UpsBizApplication {

    @Autowired
    private InitQuartzService initQuartzService;

    private static final Logger logger = LoggerFactory.getLogger(UpsBizApplication.class);

    public static void main(String[] args) {
        logger.info ("begin to start-up [ups-biz]");
        ApplicationContext app = SpringApplication.run(UpsBizApplication.class, args);
      //  SpringContextHelper.setApplicationContext(app);
        logger.info ("start-up [ups-biz] success !!!");
    }



    @PostConstruct
    public void  InitQuartz() {
        initQuartzService.runInitQuartz();
    }
}
