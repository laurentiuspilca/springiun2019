package com.example.javaspringinge15.services;

import com.example.javaspringinge15.model.Product;
import com.example.javaspringinge15.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product p) {
        productRepository.addProduct(p.getName());
    }

    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }
}
