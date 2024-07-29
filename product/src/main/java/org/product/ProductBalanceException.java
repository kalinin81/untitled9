package org.product;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Product Balance Exception")
public class ProductBalanceException extends RuntimeException {
    public ProductBalanceException(Long productId, BigDecimal balance) {
        super(String.format("Product %d balance is %s", productId, balance));
    }
}
