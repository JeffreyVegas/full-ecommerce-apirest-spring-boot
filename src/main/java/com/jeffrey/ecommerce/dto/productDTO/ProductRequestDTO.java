package com.jeffrey.ecommerce.dto.productDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDTO {
    private String name;
    private String description;
    private String brand;
    private Integer stock;
    private Double price;
    private Double comparePrice;
    private String imgUrl;
    private Double rating;
    private String specifications;
    private Long categoryId;
}
