package com.spring.cloud.consul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulDemo {

    public static void main(String[] args) {
        SpringApplication.run(ConsulDemo.class, args);
    }
}
