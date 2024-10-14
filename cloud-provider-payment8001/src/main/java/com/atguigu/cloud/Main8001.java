package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName: Main8001
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author HL
 * @Create 9/28/2024 10:52 AM
 * @Version:
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@MapperScan("com.atguigu.cloud.mapper")
public class Main8001 {
    public static void main(String[] args) {
        SpringApplication.run(Main8001.class, args);
    }
}
