package com.atguigu.cloud.entities;

import javax.persistence.*;

/**
 * 表名：t_account
*/
@Table(name = "t_account")
public class Account {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * user id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * total balance
     */
    private Long total;

    /**
     * used balance
     */
    private Long used;

    /**
     * available balance
     */
    private Long residue;

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
     * 获取total balance
     *
     * @return total - total balance
     */
    public Long getTotal() {
        return total;
    }

    /**
     * 设置total balance
     *
     * @param total total balance
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * 获取used balance
     *
     * @return used - used balance
     */
    public Long getUsed() {
        return used;
    }

    /**
     * 设置used balance
     *
     * @param used used balance
     */
    public void setUsed(Long used) {
        this.used = used;
    }

    /**
     * 获取available balance
     *
     * @return residue - available balance
     */
    public Long getResidue() {
        return residue;
    }

    /**
     * 设置available balance
     *
     * @param residue available balance
     */
    public void setResidue(Long residue) {
        this.residue = residue;
    }
}