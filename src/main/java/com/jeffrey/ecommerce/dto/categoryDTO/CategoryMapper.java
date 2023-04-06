package com.jeffrey.ecommerce.dto.categoryDTO;
import com.jeffrey.ecommerce.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryMapper {

    public CategoryMapper(){}

    public static Category toEntity(CategoryRequestDTO requestDTO) {
        Category entity = new Category();
        entity.setName(requestDTO.getName());
        if (requestDTO.getParentId() != null) {
            Category parent = new Category();
            parent.setId(requestDTO.getParentId());
            entity.setParent(parent);
        }
        return entity;
    }

    public static CategoryResponseDTO toDTO(Category entity) {
        CategoryResponseDTO responseDTO = new CategoryResponseDTO();
        responseDTO.setId(entity.getId());
        responseDTO.setName(entity.getName());
        if (entity.getParent() != null) {
            responseDTO.setParent(entity.getParent().getId());
        }
        if(!entity.getChildren().isEmpty()){
            List<CategoryResponseDTO> listCategoryResponseDTO = new ArrayList<>();
            for (Category subCategory:entity.getChildren()) {
                CategoryResponseDTO categoryResponseDTO = toDTO(subCategory);
                listCategoryResponseDTO.add(categoryResponseDTO);
            }
            responseDTO.setChildren(listCategoryResponseDTO);
        }
        return responseDTO;
    }
}
