package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: Main8401
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author HL
 * @Create 10/10/2024 2:52 PM
 * @Version:
 */@SpringBootApplication
@EnableDiscoveryClient
public class Main8401 {
    public static void main(String[] args) {
        SpringApplication.run(Main8401.class, args);
    }
}
