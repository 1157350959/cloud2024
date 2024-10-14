package com.atguigu.cloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * ClassName: AccountService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 3:51 PM
 * @Version:
 */
public interface AccountService {
    void decrease(Long userId, Long money);
}
