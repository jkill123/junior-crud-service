package com.company.juniorcrudservice.controller;

import com.company.juniorcrudservice.controller.response.ApiResponse;
import com.company.juniorcrudservice.model.Employee;
import com.company.juniorcrudservice.dto.EmployeeDto;
import com.company.juniorcrudservice.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @CrossOrigin("*")
    @GetMapping()
    public ApiResponse<List<Employee>> getEmployees() {
        ApiResponse<List<Employee>> response = new ApiResponse<>();
        List<Employee> employees = employeeService.getEmployees();
        if (!CollectionUtils.isEmpty(employees)) {
            response.setSuccess(true);
            response.setData(employees);
        }
        return response;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Integer employeeId){
        Employee employee = employeeService.getEmployeeById(employeeId);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        }
        return (ResponseEntity<Employee>) ResponseEntity.notFound();
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
