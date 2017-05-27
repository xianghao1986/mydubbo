package com.wtsd;

import com.wtsd.dubbo.ServiceTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xianghao on 2017/5/27.
 */
@RestController
public class DubboController{

    @Autowired
    private ServiceTest serviceTest;

    @RequestMapping("/test")
    public Object test(){
        return  serviceTest.test("");
    }

}
