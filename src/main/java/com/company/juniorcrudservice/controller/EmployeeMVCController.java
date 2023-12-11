package com.company.juniorcrudservice.controller;

import com.company.juniorcrudservice.model.Employee;
import com.company.juniorcrudservice.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/employee")
@Controller
public class EmployeeMVCController {

    private final EmployeeService employeeService;

    @GetMapping()
    public String frontPage() {
        return "index";
    }

    @GetMapping("/list")
    public String allEmployees(Model model) {
        List<Employee> employees = employeeService.getEmployees();
        model.addAttribute("employeeList", employees);
        return "employee";
    }

    @GetMapping("/{id}")
    public String getEmployeeById(@PathVariable Integer id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employeeById";
    }

    @GetMapping("/by-name")
    public String getEmployeeByNamed(@RequestParam String name, Model model) {
        Employee employee = employeeService.getEmployees().stream()
                .filter(empl -> empl.getName().equals(name)).findFirst().get();
        model.addAttribute("employee", employee);
        return "employeeById";
    }
}
