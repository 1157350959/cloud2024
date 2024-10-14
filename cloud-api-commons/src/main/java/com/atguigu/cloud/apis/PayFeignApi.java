package com.atguigu.cloud.apis;

import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.concurrent.CompletableFuture;

/**
 * ClassName: PayFeignApi
 * Package: com.atguigu.cloud.apis
 * Description:
 *
 * @Author HL
 * @Create 10/5/2024 9:32 AM
 * @Version:
 */

//provide the to-connect service's registered name on consul
@FeignClient("cloud-payment-service")
public interface PayFeignApi {
    @PostMapping("pay/add")
    public ResultData addOrder(@RequestBody PayDTO payDTO);

    @GetMapping("pay/get/{id}")
    public ResultData getPayInfo(@PathVariable("id") Integer id);

    @GetMapping("pay/get/info")
    public String getInfoByConsul();

    @GetMapping("pay/circuit/{id}")
    public String myCircuit(@PathVariable("id") Integer id);

    @GetMapping("pay/circuit/{id}")
    String myBulkhead(@PathVariable("id") Integer id);

    @GetMapping("pay/micrometer/{id}")
    public String myMicrometer(@PathVariable("id") Integer id);
}
