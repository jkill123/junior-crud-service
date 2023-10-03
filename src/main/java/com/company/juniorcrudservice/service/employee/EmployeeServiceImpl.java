package com.company.juniorcrudservice.service.employee;

import com.company.juniorcrudservice.domain.Employee;
import com.company.juniorcrudservice.model.EmployeeDto;
import com.company.juniorcrudservice.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Slf4j
@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Optional<List<Employee>> getEmployees() {
        log.debug("Get employees");
        return Optional.of(employeeRepository.findAll());
    }

    @Override
    @Async
    public Optional<Employee> getEmployeeById(Integer employeeId) {
        log.debug("Get employee by id: " + employeeId);
        return Optional.of(employeeRepository.getOne(employeeId));
    }

    @Override
    public void saveNewEmployee(EmployeeDto employeeDto) {
        log.debug("Save employee: " + employeeDto);
        employeeRepository.save(new Employee(employeeDto));
    }

    @Override
    @Async
    public void updateEmployee(Integer employeeId, EmployeeDto employeeDto) {
        log.debug("Update employee: " + employeeDto);
        Employee employee = employeeRepository.getOne(employeeId);
        employee.setName(employeeDto.getName());
        employee.setAge(employeeDto.getAge());
        employee.setDescription(employeeDto.getDescription());
        employee.setPosition(employeeDto.getPosition());
        employee.setSurName(employeeDto.getSurName());
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        log.debug("delete employee with id: " + employeeId);
        employeeRepository.deleteById(employeeId);
    }
}
