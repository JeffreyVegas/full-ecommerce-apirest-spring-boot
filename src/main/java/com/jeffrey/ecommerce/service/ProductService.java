package com.jeffrey.ecommerce.service;

import com.jeffrey.ecommerce.dto.productDTO.ProductFilterDTO;
import com.jeffrey.ecommerce.dto.productDTO.ProductRequestDTO;
import com.jeffrey.ecommerce.dto.productDTO.ProductResponseDTO;

import java.util.List;

public interface ProductService {
//    public List<> getProducts();
    public List<ProductResponseDTO> findProductsByFilter(ProductFilterDTO filter);
    public ProductResponseDTO createProduct(ProductRequestDTO productDTO);
}
