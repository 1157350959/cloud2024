package com.atguigu.cloud.controller;

import com.atguigu.cloud.apis.PayFeignApi;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: OrderController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/2/2024 1:19 PM
 * @Version:
 */
@RestController
@RequestMapping("consumer")
public class OrderController {
    @Resource
    private PayFeignApi payFeignApi;

    @PostMapping("feign/pay/add")
    public ResultData addOrder(@RequestBody PayDTO payDTO){
        return payFeignApi.addOrder(payDTO);
    }

    @GetMapping("feign/pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id){
        return payFeignApi.getPayInfo(id);
    }

    @GetMapping("feign/pay/mylb")
    public String mylb(){
        return payFeignApi.getInfoByConsul();
    }

//    public static final String PaymentSrv_URL = "http://cloud-payment-service";
//    @Resource
//    private RestTemplate restTemplate;
//
//    @GetMapping("pay/add")
//    public ResultData addOrder(PayDTO payDTO){
//        return restTemplate.postForObject(PaymentSrv_URL+"/pay/add", payDTO, ResultData.class);
//    }
//
//    @GetMapping("pay/get/{id}")
//    public ResultData getPayInfo(@PathVariable("id") Integer id){
//        return restTemplate.getForObject(PaymentSrv_URL+"/pay/get/"+id, ResultData.class, id);
//    }
//
//    @PutMapping("pay/update")
//    public void updatePay(@RequestBody PayDTO payDTO){
//        restTemplate.put(PaymentSrv_URL+"/pay/update", payDTO);
//    }
//
//    @DeleteMapping("pay/del/{id}")
//    public void deletePay(@PathVariable("id") Integer id){
//        restTemplate.delete(PaymentSrv_URL+"/pay/del/"+id, ResultData.class, id);
//    }
//
//    @GetMapping("pay/get/info")
//    private String getInfoByConsul(){
//        return restTemplate.getForObject(PaymentSrv_URL+"/pay/get/info", String.class);
//    }
}
