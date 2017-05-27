package com.wtsd;


import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by xianghao on 2017/5/26.
 */
@Configuration
@EnableAutoConfiguration
@ImportResource(locations={"classpath:dubbo.xml"})
public class XmlConfig {

    @PostConstruct
    public void init(){
        System.err.println("Init...");
    }
}
