package com.atguigu.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PayMicrometerController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/8/2024 2:38 PM
 * @Version:
 */
@RestController
public class PayMicrometerController {
    @GetMapping("/pay/micrometer/{id}")
    public String myMicrometer(@PathVariable("id") Integer id){
        return "Hello, welcome to myMicrometer inputId:  "+id;
    }
}
