package com.atguigu.cloud.controller;

import cn.hutool.core.util.IdUtil;
import com.atguigu.cloud.entities.Pay;
import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PayGatewayController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/8/2024 8:17 PM
 * @Version:
 */
@RestController
public class PayGatewayController {
    @Resource
    PayService payservice;

    @GetMapping("pay/gateway/get/{id}")
    public ResultData<Pay> getById(@PathVariable("id") Integer id){
        Pay pay = payservice.getById(id);
        return ResultData.success(pay);
    }

    @GetMapping("pay/gateway/info")
    public ResultData<String> getGatewayInfo(){
        return ResultData.success("gateway info test: "+ IdUtil.simpleUUID());
    }
}
