//package com.company.juniorcrudservice.service.employee;
//
//import com.company.juniorcrudservice.model.Employee;
//import com.company.juniorcrudservice.dto.EmployeeDto;
//import com.company.juniorcrudservice.repository.EmployeeRepository;
//import com.company.juniorcrudservice.repository.jdbc.EmployeeJDBCRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//
//@Slf4j
//@RequiredArgsConstructor
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private final EmployeeRepository employeeRepository;
//    private final EmployeeJDBCRepository employeeJDBCRepository;
//
//    @Override
//    public List<Employee> getEmployees() {
//        log.debug("Get employees");
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee getEmployeeById(Integer employeeId) {
//        log.debug("Get employee by id: " + employeeId);
//        return employeeRepository.getOne(employeeId);
//    }
//
//    @Override
//    public void saveNewEmployee(EmployeeDto employeeDto) {
//        log.debug("Save employee: " + employeeDto);
//        employeeRepository.save(new Employee(employeeDto));
//    }
//
//    @Override
//    public void updateEmployee(Integer employeeId, EmployeeDto employeeDto) {
//        log.debug("Update employee: " + employeeDto);
//        Employee employee = employeeRepository.getOne(employeeId);
//        employee.setName(employeeDto.getName());
//        employee.setAge(employeeDto.getAge());
//        employee.setDescription(employeeDto.getDescription());
//        employee.setPosition(employeeDto.getPosition());
//        employee.setSurName(employeeDto.getSurName());
//        employeeRepository.save(employee);
//    }
//
//    @Override
//    public void deleteEmployeeById(Integer employeeId) {
//        log.debug("delete employee with id: " + employeeId);
//        employeeRepository.deleteById(employeeId);
//    }
//
//    // todo JDBC
////    @Override
////    public List<Employee> getEmployees() {
////        log.debug("Get employees");
////        return employeeJDBCRepository.getAll();
////    }
////
////    @Override
////    public Employee getEmployeeById(Integer employeeId) {
////        log.debug("Get employee by id: " + employeeId);
////        return employeeJDBCRepository.getById(employeeId.intValue());
////    }
////
////    @Override
////    @Transactional
////    public void saveNewEmployee(EmployeeDto employeeDto) {
////        log.debug("Save employee: " + employeeDto);
////        employeeJDBCRepository.save(employeeDto);
////    }
////
////    @Override
////    public void deleteEmployeeById(Integer employeeId) {
////        log.debug("delete employee with id: " + employeeId);
////        employeeJDBCRepository.deleteById(employeeId);
////    }
//}
