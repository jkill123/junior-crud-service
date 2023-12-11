package com.company.juniorcrudservice.controller;

import com.company.juniorcrudservice.dto.EmployeeDto;
import com.company.juniorcrudservice.model.Employee;
import com.company.juniorcrudservice.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/api/v2/employee")
@RestController
public class EmployeeV2Controller {

    private final EmployeeService employeeService;

//    @GetMapping("/{name}")
//    public Optional<Employee> getEmployeeById(@PathVariable("name") StringBuilder name){
//        //todo employeeService.getEmployeeByName(name);
//        return employeeService.getEmployeeById(11);
//    }
}
