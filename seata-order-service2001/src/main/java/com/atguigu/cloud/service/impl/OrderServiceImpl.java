package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.apis.AccountFeignApi;
import com.atguigu.cloud.apis.StorageFeignApi;
import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.mapper.OrderMapper;
import com.atguigu.cloud.service.OrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * ClassName: OrderServiceImpl
 * Package: com.atguigu.cloud.service.impl
 * Description:
 *
 * @Author HL
 * @Create 10/12/2024 3:12 PM
 * @Version:
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @Resource
    private StorageFeignApi storageFeignApi;

    @Resource
    private AccountFeignApi accountFeignApi;

    @Override
    @GlobalTransactional(name="my-create-order", rollbackFor=Exception.class)
    public void create(Order order) {
        //check xid, global transaction id
        String xid = RootContext.getXID();

        log.info("starts creating new order: "+"\t" + "xid: "+xid);
        order.setStatus(0);
        int result = orderMapper.insertSelective(order);
        Order orderFromDB = null;
        if(result > 0){
            orderFromDB = orderMapper.selectOne(order);
            log.info("creating new order successful, orderFromDB: "+orderFromDB.toString());
            System.out.println();
            log.info("starts invoking storageApi");
            storageFeignApi.decrease(orderFromDB.getProductId(), orderFromDB.getCount());
            log.info("finishes storageApi");
            System.out.println();
            log.info("starts invoking accountApi");
            accountFeignApi.decrease(orderFromDB.getUserId(), orderFromDB.getMoney());
            log.info("finishes accountApi");
            orderFromDB.setStatus(1);
            Example example = new Example(Order.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("userId", orderFromDB.getUserId());
            criteria.andEqualTo("status",0);
            int i = orderMapper.updateByExampleSelective(orderFromDB, example);
        }
        System.out.println();
        log.info("finishes creating new order: "+"\t" + "xid: "+xid);
    }
}
