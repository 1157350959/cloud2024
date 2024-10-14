package com.atguigu.cloud.controller;

import com.atguigu.cloud.apis.PayFeignApi;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

/**
 * ClassName: OrderCircuitController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/5/2024 6:00 PM
 * @Version:
 */
@RestController
public class OrderCircuitController {
    @Resource
    private PayFeignApi payFeignApi;

    @GetMapping("feign/pay/circuit/{id}")
    @CircuitBreaker(name = "cloud-payment-service", fallbackMethod = "myCircuitFallback")
    public String myCircuitBreaker(@PathVariable("id") Integer id){
        return payFeignApi.myCircuit(id);
    }
    public String myCircuitFallback(Integer id, Throwable t){
        return "System busy, please try again later";
    }

    @GetMapping("feign/pay/bulkhead/{id}")
    @Bulkhead(name="cloud-payment-service",fallbackMethod = "myBulkheadPoolFallback", type=Bulkhead.Type.THREADPOOL)
    public CompletableFuture<String> myBulkheadTHREADPOOL(@PathVariable("id") Integer id){
        return CompletableFuture.supplyAsync(() -> payFeignApi.myBulkhead(id));
    }
    public CompletableFuture<String>  myBulkheadPoolFallback(Integer id, Throwable t){
        return CompletableFuture.supplyAsync(() -> "bulkhead reached max number, server busy, try again later");
    }
}
