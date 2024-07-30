package org.product.service;

import org.product.domain.ProductBalanceException;
import org.product.mapper.ProductMapper;
import org.product.domain.ProductNotFoundException;
import org.product.domain.dto.ProductsDto;
import org.product.domain.entity.Product;
import org.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductsDto getAll() {
        List<Product> all = productRepository.findAll();
        return productMapper.toDto(all);
    }

    public ProductsDto getClientProducts(String account) {
        return productMapper.toDto(productRepository.findByAccount(account));
    }

    public ProductsDto getClientProducts(Long productId, BigDecimal balance) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));
        if (product.getBalance().compareTo(balance) < 0) {
            throw new ProductBalanceException(productId, balance);
        }
        return productMapper.toDto(List.of(product));
    }
}
