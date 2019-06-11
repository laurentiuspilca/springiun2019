package repositories;

import mapper.ProductRowMapper;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String name) {
        String sql = "INSERT INTO product VALUES (NULL, ?)";
        jdbcTemplate.update(sql, name);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addProductException(String name) {
        String sql = "INSERT INTO product VALUES (NULL, ?)";
        jdbcTemplate.update(sql, name);
        throw new RuntimeException(":(");
    }


    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new ProductRowMapper());
    }


}
