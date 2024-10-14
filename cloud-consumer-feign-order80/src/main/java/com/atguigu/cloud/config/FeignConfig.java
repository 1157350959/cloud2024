package com.atguigu.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: FeignConfig
 * Package: com.atguigu.cloud.config
 * Description:
 *
 * @Author HL
 * @Create 10/5/2024 3:04 PM
 * @Version:
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer myRetryer(){

        return new Retryer.Default(100,1,3);
    }

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
