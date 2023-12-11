//package com.company.juniorcrudservice.repository.mappers;
//
//import com.company.juniorcrudservice.model.Employee;
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class EmployeeRowMapper implements RowMapper<Employee> {
//
//    @Override
//    public Employee mapRow(ResultSet rs, int rowNumber) throws SQLException {
//        Employee employee = new Employee();
//        employee.setId(rs.getInt("id"));
//        employee.setName(rs.getString("name"));
//        employee.setSurName(rs.getString("sur_name"));
//        employee.setDescription(rs.getString("description"));
//        employee.setPosition(rs.getString("position"));
//        employee.setAge(rs.getInt("age"));
//
//        return employee;
//    }
//}
