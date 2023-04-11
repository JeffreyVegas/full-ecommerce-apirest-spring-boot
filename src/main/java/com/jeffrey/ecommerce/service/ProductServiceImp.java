package com.jeffrey.ecommerce.service;

import com.jeffrey.ecommerce.dto.productDTO.ProductFilterDTO;
import com.jeffrey.ecommerce.dto.productDTO.ProductMapper;
import com.jeffrey.ecommerce.dto.productDTO.ProductRequestDTO;
import com.jeffrey.ecommerce.dto.productDTO.ProductResponseDTO;
import com.jeffrey.ecommerce.entity.Category;
import com.jeffrey.ecommerce.entity.Product;
import com.jeffrey.ecommerce.repository.CategoryRepository;
import com.jeffrey.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository repository;
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<ProductResponseDTO> findProductsByFilter(ProductFilterDTO filter) {

        List<Product> products = repository.findByBrandOrStockOrPrice(
                filter.getBrands(), filter.getStock(), filter.getPriceMin(), filter.getPriceMax()
        );

        List<ProductResponseDTO> responseDTOs = new ArrayList<>();
        for (Product product : products) {
            ProductResponseDTO responseDTO = ProductMapper.toDto(product);
            responseDTOs.add(responseDTO);
        }
        return responseDTOs;
    }

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO productDTO) {
        Category category = categoryRepository.getById(productDTO.getCategoryId());
        Product product = ProductMapper.toEntity(productDTO);
        product.setCategory(category);
        return ProductMapper.toDto(repository.save(product));
    }

}
