package com.atguigu.cloud.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 表名：t_pay
 * 表注释：payment transaction table
*/
@Table(name = "t_pay")
public class Pay {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * payment serial number
     */
    @Column(name = "pay_no")
    private String payNo;

    /**
     * order serial number
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * user account id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * transaction amount
     */
    private BigDecimal amount;

    /**
     * delete indicator, 1 for deleted
     */
    private Byte deleted;

    /**
     * create time
     */
    @Column(name = "create_time")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createTime;

    /**
     * update time
     */
    @Column(name = "update_time")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取payment serial number
     *
     * @return payNo - payment serial number
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * 设置payment serial number
     *
     * @param payNo payment serial number
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * 获取order serial number
     *
     * @return orderNo - order serial number
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置order serial number
     *
     * @param orderNo order serial number
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取user account id
     *
     * @return userId - user account id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置user account id
     *
     * @param userId user account id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取transaction amount
     *
     * @return amount - transaction amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置transaction amount
     *
     * @param amount transaction amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取delete indicator, 1 for deleted
     *
     * @return deleted - delete indicator, 1 for deleted
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * 设置delete indicator, 1 for deleted
     *
     * @param deleted delete indicator, 1 for deleted
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取create time
     *
     * @return createTime - create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create time
     *
     * @param createTime create time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取update time
     *
     * @return updateTime - update time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置update time
     *
     * @param updateTime update time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}