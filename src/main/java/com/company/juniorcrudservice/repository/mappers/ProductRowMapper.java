package com.company.juniorcrudservice.repository.mappers;

import com.company.juniorcrudservice.model.order.data.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNumber) throws SQLException {
        Product product = new Product();
        product.setId(rs.getInt("id"));
        product.setName(rs.getString("name"));
        product.setCost(rs.getDouble("cost"));

        return product;
    }
}
