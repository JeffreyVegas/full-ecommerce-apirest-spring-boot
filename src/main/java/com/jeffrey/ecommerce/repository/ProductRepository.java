package com.jeffrey.ecommerce.repository;

import com.jeffrey.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByBrandInAndStockGreaterThanEqualAndPriceBetween(String[] brands, int stock, double priceMin, double priceMax);
}
