package com.product.microservices.productservices.controller;

import com.product.microservices.productservices.dto.ProductRequest;
import com.product.microservices.productservices.dto.ProductResponse;
import com.product.microservices.productservices.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  void createProduct(@RequestBody ProductRequest productRequest){
        productService.CreateProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
     return productService.getAllProducts();
    }
}
