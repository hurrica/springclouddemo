package com.spring.cloud.eureka.consumer.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT-DEMO/test/hello", String.class).getBody();
    }
}
