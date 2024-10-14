package com.atguigu.cloud;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName: SeataStorageMainApp2002
 * Package: com.atguigu.cloud
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 3:33 PM
 * @Version:
 */
@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper")
@EnableFeignClients
@EnableDiscoveryClient
public class SeataStorageMainApp2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorageMainApp2002.class, args);
    }
}
