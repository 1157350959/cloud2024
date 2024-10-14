package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.mapper.AccountMapper;
import com.atguigu.cloud.service.AccountService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.accessibility.Accessible;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: AccountServiceImpl
 * Package: com.atguigu.cloud.service.impl
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 3:52 PM
 * @Version:
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, Long money) {
        log.info("account-service starts deducting money");
        //myTimeOut();
        accountMapper.decrease(userId, money);
        log.info("account-service finishes deducting money");
    }
    private static void myTimeOut(){
        try{
            TimeUnit.SECONDS.sleep(65);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
