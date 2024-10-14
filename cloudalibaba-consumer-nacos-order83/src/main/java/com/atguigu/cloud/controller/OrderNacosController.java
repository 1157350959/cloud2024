package com.atguigu.cloud.controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: OrderNacosController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/10/2024 10:09 AM
 * @Version:
 */
@RestController
public class OrderNacosController {
    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping("consumer/pay/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){
        String result = restTemplate.getForObject(serverURL+"/pay/nacos/"+id, String.class);
        return result+"\t"+"    This is from 83 the consuemr.";
    }
}
