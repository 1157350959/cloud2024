package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: PayController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 9/30/2024 3:43 PM
 * @Version:
 */
@RestController
@RequestMapping("pay")
@Slf4j
public class PayController {
    @Resource
    private PayService payService;

    @PostMapping("add")
    public ResultData<String> addPay(@RequestBody Pay pay){
        int add = payService.add(pay);
        return ResultData.success("successfully inserted record, return value " + add);
    }

    @DeleteMapping("del/{id}")
    public ResultData<Integer> deletePay(@PathVariable("id") Integer id){
        return ResultData.success(payService.delete(id));
    }

    @PutMapping("update")
    public ResultData<String> updatePay(@RequestBody PayDTO payDTO){
        System.out.println(payDTO.getAmount());
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);
        int update = payService.update(pay);
        return ResultData.success("successfully updated record, return value " + update);
    }

    @GetMapping("get/{id}")
    public ResultData<Pay> getById(@PathVariable("id") Integer id){
        return ResultData.success(payService.getById(id));
    }

    @GetMapping("getAll")
    public ResultData<List<Pay>> getAll(){
        return ResultData.success(payService.getAll());
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("get/info")
    public String getInfoByConsul(@Value("${atguigu.info}") String atguiguInfo){
        return "atguiguInfo: "+atguiguInfo+"\t"+"port: "+port;
    }
}
