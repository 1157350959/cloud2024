package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: Main9001
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author HL
 * @Create 10/9/2024 8:43 PM
 * @Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9001 {
    public static void main(String[] args) {
        SpringApplication.run(Main9001.class, args);
    }
}
