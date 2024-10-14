package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: Main83
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author HL
 * @Create 10/10/2024 10:04 AM
 * @Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main83 {
    public static void main(String[] args) {
        SpringApplication.run(Main83.class, args);
    }

}
