package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.mapper.StorageMapper;
import com.atguigu.cloud.service.StorageService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ClassName: StorageServiceImpl
 * Package: com.atguigu.cloud.service.impl
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 3:40 PM
 * @Version:
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("storage-service decreasing the quantity");
        storageMapper.decrease(productId, count);
        log.info("storage-service finishes decreasing the quantity");
    }
}
