package com.jeffrey.ecommerce.dto.productDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductFilterDTO {
    private List<String> brands;
    private Integer stock;
    private Double priceMin;
    private Double priceMax;
}
