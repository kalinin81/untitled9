package org.product.domain.dto;

import lombok.Builder;
import lombok.Data;
import org.product.domain.dto.ProductDto;

import java.util.List;

@Data
@Builder
public class ProductsDto {
    private List<ProductDto> productDtoList;
}
