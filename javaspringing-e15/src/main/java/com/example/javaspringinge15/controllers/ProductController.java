package com.example.javaspringinge15.controllers;

import com.example.javaspringinge15.model.Product;
import com.example.javaspringinge15.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/add")
    public void addProduct(@RequestBody Product p) {
        productService.addProduct(p);
    }

    @GetMapping("/products/all")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }
}
