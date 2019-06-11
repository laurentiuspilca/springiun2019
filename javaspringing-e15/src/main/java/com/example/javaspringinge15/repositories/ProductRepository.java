package com.example.javaspringinge15.repositories;

import com.example.javaspringinge15.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String name) {
        String sql = "INSERT INTO product VALUES (NULL, ?)";
        jdbcTemplate.update(sql, name);
    }

    public List<Product> findAllProducts() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet resultSet, int i) throws SQLException {
                Product p = new Product();
                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                return p;
            }
        });
    }
}
