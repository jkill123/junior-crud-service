package com.company.juniorcrudservice.controller;

import com.company.juniorcrudservice.model.Employee;
import com.company.juniorcrudservice.dto.EmployeeDto;
import com.company.juniorcrudservice.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @CrossOrigin("*")
    @GetMapping()
    public Optional<List<Employee>> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{employeeId}")
    public Optional<Employee> getEmployeeById(@PathVariable("employeeId") Integer employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @CrossOrigin("*")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.saveNewEmployee(employeeDto);
    }

    @PutMapping("/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployeeById(@PathVariable("employeeId") Integer employeeId, @RequestBody EmployeeDto employeeDto) {
        employeeService.updateEmployee(employeeId, employeeDto);
    }

    @DeleteMapping("/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployeeById(@PathVariable("employeeId") Integer employeeId) {
        employeeService.deleteEmployeeById(employeeId);
    }
}
