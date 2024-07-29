package org.product;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private Long id;
    private String account;
    private BigDecimal balance;
    private Type type;

}
