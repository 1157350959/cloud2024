package com.atguigu.cloud.entities;

import lombok.ToString;

import javax.persistence.*;

/**
 * 表名：t_storage
*/
@Table(name = "t_storage")
@ToString
public class Storage {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * product id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * total quantity
     */
    private Integer total;

    /**
     * used quantity
     */
    private Integer used;

    /**
     * available quantity
     */
    private Integer residue;

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
     * 获取total quantity
     *
     * @return total - total quantity
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 设置total quantity
     *
     * @param total total quantity
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 获取used quantity
     *
     * @return used - used quantity
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * 设置used quantity
     *
     * @param used used quantity
     */
    public void setUsed(Integer used) {
        this.used = used;
    }

    /**
     * 获取available quantity
     *
     * @return residue - available quantity
     */
    public Integer getResidue() {
        return residue;
    }

    /**
     * 设置available quantity
     *
     * @param residue available quantity
     */
    public void setResidue(Integer residue) {
        this.residue = residue;
    }
}