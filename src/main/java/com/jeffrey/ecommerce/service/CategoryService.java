package com.jeffrey.ecommerce.service;

import com.jeffrey.ecommerce.dto.categoryDTO.CategoryRequestDTO;
import com.jeffrey.ecommerce.dto.categoryDTO.CategoryResponseDTO;
import com.jeffrey.ecommerce.entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getCategories();
    public List<CategoryResponseDTO> getAllCategoriesAndSubCategories();
    public CategoryResponseDTO createCategory(CategoryRequestDTO categoryRequestDTO);

}
