package com.company.juniorcrudservice.service.employee;


import com.company.juniorcrudservice.model.Employee;
import com.company.juniorcrudservice.dto.EmployeeDto;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> getEmployeeById(Integer employeeId);
    Optional<List<Employee>> getEmployees();
    void saveNewEmployee(EmployeeDto employeeDto);
    void updateEmployee(Integer employeeId, EmployeeDto employeeDto);
    void deleteEmployeeById(Integer employeeId);
}
