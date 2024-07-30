package org.paycore.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductsDto {
    private List<ProductDto> productDtoList;
}
