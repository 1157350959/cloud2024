package com.atguigu.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ClassName: PayDTO
 * Package: com.atguigu.cloud.entities
 * Description:
 *
 * @Author HL
 * @Create 10/2/2024 1:07 PM
 * @Version:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayDTO implements Serializable {
    private Integer id;
    private String payNo;
    private String orderNo;
    private Integer userId;
    private BigDecimal amount;
}
