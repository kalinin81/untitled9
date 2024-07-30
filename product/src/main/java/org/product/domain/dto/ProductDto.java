package org.product.domain.dto;

import lombok.Data;
import org.product.domain.Type;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private Long id;
    private String account;
    private BigDecimal balance;
    private Type type;

}
