package com.company.juniorcrudservice.repository.jdbc;

import com.company.juniorcrudservice.dto.EmployeeDto;
import com.company.juniorcrudservice.model.Employee;
import com.company.juniorcrudservice.model.Order;
import com.company.juniorcrudservice.model.Product;
import com.company.juniorcrudservice.repository.mappers.EmployeeRowMapper;
import com.company.juniorcrudservice.repository.mappers.OrdersRowMapper;
import com.company.juniorcrudservice.repository.mappers.ProductRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrdersJDBCRepository {

    private final String SELECT_EMPLOYEE_BY_ID = "SELECT * FROM employee WHERE id = ";
    private final String DELETE_EMPLOYEE_BY_ID = "DELETE FROM employee WHERE id = ";
    private final String SELECT_ALL_EMPLOYEE = "SELECT * FROM orders";
    private final String SAVE_NEW_EMPLOYEE = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?)";

    private final JdbcTemplate jdbcTemplate;

    public Employee getById(int id) {
        Employee result = jdbcTemplate.queryForObject(SELECT_EMPLOYEE_BY_ID + id, new EmployeeRowMapper());
        return result;
    }

    public List<Order> getAll() {
        List<Order> result = jdbcTemplate.query(SELECT_ALL_EMPLOYEE, new OrdersRowMapper());

        for (Order order : result) {
            Integer orderId = order.getId();
            List<Product> products = jdbcTemplate.query("SELECT " + orderId, new ProductRowMapper());
        }
        return result;
    }

    public void save(EmployeeDto dto) {
        jdbcTemplate.update(SAVE_NEW_EMPLOYEE, dto.getAge(), dto.getId(), dto.getDescription(), dto.getName(),
                dto.getPosition(), dto.getSurName());
    }

    public void deleteById(Integer employeeId) {
        jdbcTemplate.update(DELETE_EMPLOYEE_BY_ID + employeeId);
    }
}
