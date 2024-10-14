package com.atguigu.cloud.controller;

import com.atguigu.cloud.service.FlowLimitService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: FlowLimitController
 * Package: controller
 * Description:
 *
 * @Author HL
 * @Create 10/10/2024 2:52 PM
 * @Version:
 */
@RestController
public class FlowLimitController {
    @Resource
    private FlowLimitService flowLimitService;
    @GetMapping("testA")
    public String testA(){
        return "------testA";
    }
    @GetMapping("testB")
    public String testB(){
        return "------testB";
    }

    @GetMapping("testC")
    public String testC(){
        flowLimitService.common();
        return "------testC";
    }
    @GetMapping("testD")
    public String testD(){
        flowLimitService.common();
        return "------testD";
    }
}
