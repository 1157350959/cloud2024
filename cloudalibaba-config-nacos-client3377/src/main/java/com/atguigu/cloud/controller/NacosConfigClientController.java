package com.atguigu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: NacosConfigClientController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/10/2024 10:56 AM
 * @Version:
 */
@RestController
@RefreshScope //This annotation enables nacos dynamic refresh
public class NacosConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
