package com.example.javaspringinge16.repositories;

import com.example.javaspringinge16.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //@Query("SELECT p FROM Product p WHERE p.name = :name")
    public Product findProductByName(String name);

    //public List<Product> findProductsByIdGreaterThan(int id);
}
