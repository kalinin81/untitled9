package org.paycore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@RestController("/api/v1/paycore")
public class PaycoreController {

    private final RestTemplate restTemplate;

    public PaycoreController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ProductsDto getProducts() {
        return restTemplate.getForObject("", ProductsDto.class);
    }

    @GetMapping("/client/{account}")
    public ProductsDto getClientProducts(@PathVariable Long account) {
        return restTemplate.getForObject("/client/{account}", ProductsDto.class, account);
    }

    @GetMapping("/client/{productId}/{balance}")
    public ProductsDto getClientProducts(@PathVariable Long productId, @PathVariable BigDecimal balance) {
        return restTemplate.getForObject("/client/{productId}/{balance}", ProductsDto.class, productId, balance);
    }
}
