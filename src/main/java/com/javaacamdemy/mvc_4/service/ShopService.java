package com.javaacamdemy.mvc_4.service;

import com.javaacamdemy.mvc_4.dto.ProductDto;
import com.javaacamdemy.mvc_4.entity.ProductEntity;
import com.javaacamdemy.mvc_4.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class ShopService {
    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public void saveNewProduct(ProductDto productDto) {
        BigDecimal selfPrice = productDto.getPrice().multiply(BigDecimal.valueOf(0.5));
        LocalDateTime createdDate = LocalDateTime.now();
        ProductEntity productEntity = new ProductEntity(productDto.getName(), productDto.getPrice(), selfPrice, createdDate);
        shopRepository.save(productEntity);
    }

    public BigDecimal getPriceByProductName(String productName) {
        return shopRepository.getAll().stream()
                .filter(product -> Objects.equals(product.getName(), productName))
                .map(ProductEntity::getPrice)
                .findFirst()
                .orElse(null);
    }
}
