package com.jeffrey.ecommerce.dto.categoryDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponseDTO {
    private Long id;
    private Long parent;
    private List<CategoryResponseDTO> children = new ArrayList<>();
    private String name;

}
