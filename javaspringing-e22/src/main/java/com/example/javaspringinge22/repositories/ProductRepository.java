package com.example.javaspringinge22.repositories;

import com.example.javaspringinge22.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {

    public void addProduct(String name) {
        System.out.println("Adding product " + name);
    }

    public List<Product> findAllProducts() {
        Product p1 = new Product();
        p1.setName("Beer");
        return Arrays.asList(p1);
    }
}
