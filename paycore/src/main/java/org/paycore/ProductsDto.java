package org.paycore;

import lombok.Data;

import java.util.List;

@Data
public class ProductsDto {
    private List<ProductDto> productDtoList;
}
