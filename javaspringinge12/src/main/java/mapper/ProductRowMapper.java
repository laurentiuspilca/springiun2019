package mapper;

import model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product p = new Product();
        p.setId(resultSet.getInt("id"));
        p.setName(resultSet.getString("name"));
        return p;
    }
}
