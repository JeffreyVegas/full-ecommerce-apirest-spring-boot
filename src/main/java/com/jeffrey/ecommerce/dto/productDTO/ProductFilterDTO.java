package com.jeffrey.ecommerce.dto.productDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductFilterDTO {
    private String[] brands;
    private Integer stock;
    private Double priceMin;
    private Double priceMax;
}
