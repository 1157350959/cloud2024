package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: Main80
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author HL
 * @Create 10/2/2024 9:57 AM
 * @Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main80 {
    public static void main(String[] args) {
        SpringApplication.run(Main80.class, args);
    }
}
