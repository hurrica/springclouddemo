package com.spring.cloud.eureka.client.controller;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private EurekaInstanceConfig config;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(config.getAppGroupName());

        return "hello  " + config.getHealthCheckUrlPath();
    }
}
