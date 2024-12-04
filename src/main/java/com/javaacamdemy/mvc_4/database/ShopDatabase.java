package com.javaacamdemy.mvc_4.database;

import com.javaacamdemy.mvc_4.dto.ProductDto;
import com.javaacamdemy.mvc_4.entity.ProductEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ShopDatabase {
    private Map<String, ProductEntity> productEntities = new HashMap<>();

    public void save(ProductEntity product) {
        productEntities.put(product.getName(), product);
    }

    public Set<ProductEntity> getAll() {
        return new HashSet<>(productEntities.values());
    }
}
