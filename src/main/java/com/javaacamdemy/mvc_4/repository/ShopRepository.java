package com.javaacamdemy.mvc_4.repository;

import com.javaacamdemy.mvc_4.database.ShopDatabase;
import com.javaacamdemy.mvc_4.entity.ProductEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Component
public class ShopRepository {
    private ShopDatabase shopDatabase;

    public ShopRepository(ShopDatabase shopDatabase) {
        this.shopDatabase = shopDatabase;
    }

    public void save(ProductEntity product) {
        shopDatabase.save(product);
    }

    public Set<ProductEntity> getAll() {
        return shopDatabase.getAll();
    }
}
