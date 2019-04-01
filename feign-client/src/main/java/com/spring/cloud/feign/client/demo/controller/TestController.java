package com.spring.cloud.feign.client.demo.controller;

import com.netflix.discovery.endpoint.EndpointUtils;
import com.spring.cloud.feign.client.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        System.out.println("--------------");
        return testService.test();
    }

    public static void main(String[] args) {
        System.out.println(999_999_999);
    }
}
