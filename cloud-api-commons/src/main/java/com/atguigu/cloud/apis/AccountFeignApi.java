package com.atguigu.cloud.apis;

import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: AccountFeignApi
 * Package: com.atguigu.cloud.apis
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 10:13 AM
 * @Version:
 */
@FeignClient("seata-account-service")
public interface AccountFeignApi {
    @PostMapping("account/decrease")
    ResultData decrease(@RequestParam("userId") Long userId, @RequestParam("money") Long money);
}
