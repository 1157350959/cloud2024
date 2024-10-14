package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: MainOpenFeign80
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author HL
 * @Create 10/4/2024 7:13 PM
 * @Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MainOpenFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(MainOpenFeign80.class, args);
    }
}
