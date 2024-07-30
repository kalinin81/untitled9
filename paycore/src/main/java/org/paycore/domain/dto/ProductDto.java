package org.paycore.domain.dto;

import lombok.Builder;
import lombok.Data;
import org.paycore.domain.Type;

import java.math.BigDecimal;

@Data
@Builder
public class ProductDto {
    private Long id;
    private String account;
    private BigDecimal balance;
    private Type type;

}
