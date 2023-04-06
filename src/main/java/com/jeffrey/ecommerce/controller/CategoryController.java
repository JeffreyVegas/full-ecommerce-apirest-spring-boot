package com.jeffrey.ecommerce.controller;


import com.jeffrey.ecommerce.dto.categoryDTO.CategoryRequestDTO;
import com.jeffrey.ecommerce.dto.categoryDTO.CategoryResponseDTO;

import com.jeffrey.ecommerce.entity.Category;
import com.jeffrey.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @Autowired
    CategoryService service;
    @GetMapping
    public ResponseEntity<List<CategoryResponseDTO>> getAllCategories(){
        return  new ResponseEntity<>(service.getAllCategoriesAndSubCategories(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<CategoryResponseDTO> addCategories(@RequestBody CategoryRequestDTO request){
        CategoryResponseDTO category = service.createCategory(request);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

}
