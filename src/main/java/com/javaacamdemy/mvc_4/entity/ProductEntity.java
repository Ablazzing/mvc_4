package com.javaacamdemy.mvc_4.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class ProductEntity {
    private String name;
    private BigDecimal price;
    private BigDecimal selfPrice;
    private LocalDateTime createdDate;

    public ProductEntity() {
    }

    public ProductEntity(String name, BigDecimal price, BigDecimal selfPrice, LocalDateTime createdDate) {
        this.name = name;
        this.price = price;
        this.selfPrice = selfPrice;
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ProductEntity that = (ProductEntity) object;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSelfPrice() {
        return selfPrice;
    }

    public void setSelfPrice(BigDecimal selfPrice) {
        this.selfPrice = selfPrice;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}


