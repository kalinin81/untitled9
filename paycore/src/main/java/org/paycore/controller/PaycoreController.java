package org.paycore.controller;

import lombok.RequiredArgsConstructor;
import org.paycore.service.ProductService;
import org.paycore.domain.dto.ProductsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController("/api/v1/paycore")
@RequiredArgsConstructor
public class PaycoreController {

    private final ProductService productService;

    @GetMapping
    public ProductsDto getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/client/{account}")
    public ProductsDto getClientProducts(@PathVariable Long account) {
        return productService.getProductsByAccount(account);
    }

    @GetMapping("/client/{productId}/{balance}")
    public ProductsDto getClientProducts(@PathVariable Long productId, @PathVariable BigDecimal balance) {
        return productService.getClientProducts(productId, balance);
    }
}
