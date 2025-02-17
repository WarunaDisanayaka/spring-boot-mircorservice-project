package com.waruna.product_service.controller;

import com.waruna.product_service.dto.ProductRequest;
import com.waruna.product_service.dto.ProductResponse;
import com.waruna.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

//    Create product
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

//    Get all products
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse>getAllProducts(){
       return productService.getAllProducts();
    }
}
