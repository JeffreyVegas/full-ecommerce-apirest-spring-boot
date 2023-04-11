package com.jeffrey.ecommerce.controller;


import com.jeffrey.ecommerce.dto.productDTO.ProductFilterDTO;
import com.jeffrey.ecommerce.dto.productDTO.ProductRequestDTO;
import com.jeffrey.ecommerce.dto.productDTO.ProductResponseDTO;
import com.jeffrey.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/filter")
    public ResponseEntity<List<ProductResponseDTO>> getProductsByFilter(@RequestBody ProductFilterDTO filter) {

        List<ProductResponseDTO> products = service.findProductsByFilter(filter);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductResponseDTO> addProduct(@RequestBody ProductRequestDTO request){
        ProductResponseDTO product = service.createProduct(request);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }


}
