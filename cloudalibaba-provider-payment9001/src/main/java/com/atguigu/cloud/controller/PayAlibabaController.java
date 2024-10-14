package com.atguigu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PayAlibabaController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/9/2024 8:44 PM
 * @Version:
 */
@RestController
public class PayAlibabaController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("pay/nacos/{id}")
    public String getPayInfo(@PathVariable("id") Integer id){
        return "nacos registry, serverPort: "+serverPort+"\t id"+id;
    }

}
