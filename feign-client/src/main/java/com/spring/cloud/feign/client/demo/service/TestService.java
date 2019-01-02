package com.spring.cloud.feign.client.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-consumer-demo")
public interface TestService {
    @GetMapping("/consumer/test")
    String test();
}
