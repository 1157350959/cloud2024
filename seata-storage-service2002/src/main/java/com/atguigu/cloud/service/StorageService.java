package com.atguigu.cloud.service;

/**
 * ClassName: StorageService
 * Package: com.atguigu.cloud.service
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 3:40 PM
 * @Version:
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
