package com.example.javaspringinge22.services;

import com.example.javaspringinge22.entities.Product;
import com.example.javaspringinge22.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addNProducts(int n) {
        if (n <=0) throw new IllegalArgumentException();
        for (int i=1; i<=n; i++) {
            productRepository.addProduct("Product " + i);
        }
    }

    public List<Product> findProductsWithGivenWordInName(String word) {
        List<Product> allProducts = productRepository.findAllProducts();
        return allProducts.stream()
                .filter(p -> p.getName().contains(word))
                .collect(Collectors.toList());
    }
}
