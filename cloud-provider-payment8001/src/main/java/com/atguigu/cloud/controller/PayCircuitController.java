package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: PayCircuitController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/5/2024 5:36 PM
 * @Version:
 */
@RestController
public class PayCircuitController {
    @GetMapping("pay/circuit/{id}")//This method only for testing circuit breaker
    public String myCircuit(@PathVariable("id") Integer id){
        if(id < 0) throw new RuntimeException("-----circuit id must > 0");
        if(id == 9999){
            try{
                TimeUnit.SECONDS.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return "Hello, circuit! inputId:  "+id+"\t"+ IdUtil.simpleUUID();
    }


}
