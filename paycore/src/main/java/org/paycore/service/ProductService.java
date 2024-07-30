package org.paycore.service;

import lombok.RequiredArgsConstructor;
import org.paycore.configuration.ProductServiceProperties;
import org.paycore.domain.dto.ProductsDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductServiceProperties productServiceProperties;
    private final RestTemplate restTemplate;

    public ProductsDto getProductsByAccount(Long account) {
        return restTemplate.getForObject(productServiceProperties.getProductsByAccountUrl(), ProductsDto.class, account);
    }

    public ProductsDto getProducts() {
        return restTemplate.getForObject("", ProductsDto.class);
    }

    public ProductsDto getClientProducts(Long productId, BigDecimal balance) {
        return restTemplate.getForObject(productServiceProperties.getProductsByProductIdUrl(), ProductsDto.class, productId, balance);
    }

}
