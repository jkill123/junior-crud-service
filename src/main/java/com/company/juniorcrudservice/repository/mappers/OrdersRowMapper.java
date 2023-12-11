package com.company.juniorcrudservice.repository.mappers;

import com.company.juniorcrudservice.model.order.data.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdersRowMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet rs, int rowNumber) throws SQLException {
        Order order = new Order();
        order.setId(rs.getInt("id"));
        order.setDate(rs.getDate("date").toLocalDate());
        order.setCost(rs.getDouble("cost"));

        return order;
    }
}
