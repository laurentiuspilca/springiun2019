package com.example.javaspringinge16.services;

import com.example.javaspringinge16.entities.Product;
import com.example.javaspringinge16.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product p) {
        productRepository.save(p);
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
