package com.jeffrey.ecommerce.dto.categoryDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequestDTO {
    private Long parentId;
    private String name;

}
