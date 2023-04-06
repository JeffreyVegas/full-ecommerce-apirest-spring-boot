package com.jeffrey.ecommerce.dto.productDTO;

import com.jeffrey.ecommerce.entity.Product;

import java.time.LocalDateTime;

public class ProductMapper {

    public ProductMapper(){}

    public static Product toEntity(ProductRequestDTO dto) {
        Product entity = new Product();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setBrand(dto.getBrand());
        entity.setStock(dto.getStock());
        entity.setPrice(dto.getPrice());
        entity.setComparePrice(dto.getComparePrice());
        entity.setImgUrl(dto.getImgUrl());
        entity.setRating(dto.getRating());
        entity.setDateCreated(LocalDateTime.now());
        entity.setSpecifications(dto.getSpecifications());
//        entity.setCategory();
        return entity;
    }

    public static ProductResponseDTO toDto(Product entity) {
        ProductResponseDTO dto = new ProductResponseDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setBrand(entity.getBrand());
        dto.setStock(entity.getStock());
        dto.setPrice(entity.getPrice());
        dto.setComparePrice(entity.getComparePrice());
        dto.setImgUrl(entity.getImgUrl());
        dto.setRating(entity.getRating());
        dto.setDateCreated(entity.getDateCreated());
        dto.setSpecifications(entity.getSpecifications());
        dto.setCategoryId(entity.getCategory().getId());
        return dto;
    }

    public static Product updateEntity(Product entity, ProductRequestDTO dto) {
        if (dto.getName() != null) {
            entity.setName(dto.getName());
        }
        if (dto.getDescription() != null) {
            entity.setDescription(dto.getDescription());
        }
        if (dto.getBrand() != null) {
            entity.setBrand(dto.getBrand());
        }
        if (dto.getStock() != null) {
            entity.setStock(dto.getStock());
        }
        if (dto.getPrice() != null) {
            entity.setPrice(dto.getPrice());
        }
        if (dto.getComparePrice() != null) {
            entity.setComparePrice(dto.getComparePrice());
        }
        if (dto.getImgUrl() != null) {
            entity.setImgUrl(dto.getImgUrl());
        }
        if (dto.getRating() != null) {
            entity.setRating(dto.getRating());
        }
        if (dto.getSpecifications() != null) {
            entity.setSpecifications(dto.getSpecifications());
        }
        return entity;
    }
}
