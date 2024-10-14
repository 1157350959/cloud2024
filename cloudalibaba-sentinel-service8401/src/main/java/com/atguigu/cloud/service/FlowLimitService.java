package com.atguigu.cloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * ClassName: FlowLimitService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author HL
 * @Create 10/10/2024 3:13 PM
 * @Version:
 */
@Service
public class FlowLimitService {
    @SentinelResource("common")
    public void common(){
        System.out.println("------FlowLimitService come in");
    }
}
