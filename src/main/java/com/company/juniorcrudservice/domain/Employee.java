package com.company.juniorcrudservice.domain;

import com.company.juniorcrudservice.dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surName;
    private String description;
    private String position;
    private Integer age;

    public Employee(EmployeeDto employeeDto){
        this.name = employeeDto.getName();
        this.surName = employeeDto.getSurName();
        this.description = employeeDto.getDescription();
        this.position = employeeDto.getPosition();
        this.age = employeeDto.getAge();
    }
}
