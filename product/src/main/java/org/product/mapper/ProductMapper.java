package org.product.mapper;

import org.product.domain.dto.ProductDto;
import org.product.domain.dto.ProductsDto;
import org.product.domain.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public ProductsDto toDto(List<Product> products) {
        List<ProductDto> productDtoList = products.stream().map(product -> {
            ProductDto productDto = new ProductDto();
            productDto.setId(product.getId());
            productDto.setAccount(product.getAccount());
            productDto.setBalance(product.getBalance());
            productDto.setType(product.getType());
            return productDto;
        }).collect(Collectors.toList());

        ProductsDto productsDto = ProductsDto.builder().productDtoList(productDtoList).build();
        return productsDto;
    }

}
