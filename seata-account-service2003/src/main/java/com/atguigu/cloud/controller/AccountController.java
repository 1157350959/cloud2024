package com.atguigu.cloud.controller;

import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: AccountController
 * Package: com.atguigu.cloud.controller
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 3:55 PM
 * @Version:
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("account/decrease")
    public ResultData decrease(@RequestParam("userId") Long userId, @RequestParam("money") Long money){
        accountService.decrease(userId, money);
        return ResultData.success("success in deducting balance");
    }
}
