package com.atguigu.cloud.apis;

import com.atguigu.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: StorageFeignApi
 * Package: com.atguigu.cloud.apis
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 10:12 AM
 * @Version:
 */
@FeignClient("seata-storage-service")
public interface StorageFeignApi {
    @PostMapping("storage/decrease")
    ResultData decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
