package com.spring.cloud.consul.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello/world")
    public String helloWorld(){
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println(instance.getServiceId());
        return "hello world";
    }
}
