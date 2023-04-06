package com.jeffrey.ecommerce.dto.productDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {
    private Long id;
    private String name;
    private String description;
    private String brand;
    private Integer stock;
    private Double price;
    private Double comparePrice;
    private String imgUrl;
    private Double rating;
    private LocalDateTime dateCreated;
    private String specifications;
    private Long categoryId;
}
