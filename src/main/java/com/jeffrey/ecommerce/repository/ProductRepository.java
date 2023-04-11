package com.jeffrey.ecommerce.repository;

import com.jeffrey.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE "
            + "(COALESCE(:brandList, NULL) IS NULL OR p.brand IN (:brandList)) "
            + "AND (:stock IS NULL OR p.stock >= :stock) "
            + "AND (:priceMin IS NULL OR p.price >= :priceMin) "
            + "AND (:priceMax IS NULL OR p.price <= :priceMax)")
    List<Product> findByBrandOrStockOrPrice(
            @Param("brandList") List<String> brandList,
            @Param("stock") Integer stock,
            @Param("priceMin") Double priceMin,
            @Param("priceMax") Double priceMax);
}
