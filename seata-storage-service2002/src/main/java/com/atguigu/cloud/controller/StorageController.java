package com.atguigu.cloud.controller;

import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.service.StorageService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: StorageController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 3:42 PM
 * @Version:
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @RequestMapping("storage/decrease")
    public ResultData decrease(Long productId, Integer count){
        storageService.decrease(productId, count);
        return ResultData.success("success in decreasing the quantity");
    }
}
