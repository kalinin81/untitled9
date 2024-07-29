package org.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ProductsDto getProducts() {
        return productService.getAll();
    }

    @GetMapping("/client/{account}")
    public ProductsDto getClientProducts(@PathVariable String account) {
        return productService.getClientProducts(account);
    }

    @GetMapping("/client/{productId}/{balance}")
    public ProductsDto getClientProducts(@PathVariable Long productId, @PathVariable BigDecimal balance) {
        return productService.getClientProducts(productId, balance);
    }

}
