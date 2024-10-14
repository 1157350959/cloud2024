package com.atguigu.cloud.entities;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 表名：t_order
*/
@Table(name = "t_order")
@ToString()
public class Order implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * user id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * product id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * quantity
     */
    private Integer count;

    /**
     * prize
     */
    private Long money;

    /**
     * order status, 0 in progress, 1 finished
     */
    private Integer status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取user id
     *
     * @return userId - user id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置user id
     *
     * @param userId user id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取product id
     *
     * @return productId - product id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置product id
     *
     * @param productId product id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取quantity
     *
     * @return count - quantity
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置quantity
     *
     * @param count quantity
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取prize
     *
     * @return money - prize
     */
    public Long getMoney() {
        return money;
    }

    /**
     * 设置prize
     *
     * @param money prize
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * 获取order status, 0 in progress, 1 finished
     *
     * @return status - order status, 0 in progress, 1 finished
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置order status, 0 in progress, 1 finished
     *
     * @param status order status, 0 in progress, 1 finished
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}