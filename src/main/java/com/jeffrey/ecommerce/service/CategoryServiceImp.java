package com.jeffrey.ecommerce.service;

import com.jeffrey.ecommerce.dto.categoryDTO.CategoryMapper;
import com.jeffrey.ecommerce.dto.categoryDTO.CategoryRequestDTO;
import com.jeffrey.ecommerce.dto.categoryDTO.CategoryResponseDTO;
import com.jeffrey.ecommerce.entity.Category;
import com.jeffrey.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    CategoryRepository repository;

    @Override
    public List<Category> getCategories() {
        return repository.findAll();
    }

    @Override
    public List<CategoryResponseDTO> getAllCategoriesAndSubCategories() {
        List<CategoryResponseDTO> categoryResponseDTOs = new ArrayList<>();
        List<Category> categories = repository.findAllWithChildren();

        for (Category category:categories
             ) {
            categoryResponseDTOs.add(CategoryMapper.toDTO(category));
        }
        return categoryResponseDTOs;
    }

    @Override
    public CategoryResponseDTO createCategory(CategoryRequestDTO categoryRequestDTO) {
         CategoryResponseDTO categoryResponseDTO=CategoryMapper.toDTO(repository.save(CategoryMapper.toEntity(categoryRequestDTO)));
        return categoryResponseDTO;
    }
}
