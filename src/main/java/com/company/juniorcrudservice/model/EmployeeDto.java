package com.company.juniorcrudservice.model;

import com.company.juniorcrudservice.domain.Employee;
import lombok.*;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
    private Integer id;
    private String name;
    private String surName;
    private String description;
    private String position;
    private Integer age;

    public EmployeeDto(Employee employee){
        this.id = employee.getId();
        this.name = employee.getName();
        this.surName = employee.getSurName();
        this.description = employee.getDescription();
        this.position = employee.getPosition();
        this.age = employee.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDto that = (EmployeeDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(surName, that.surName) && Objects.equals(description, that.description) && Objects.equals(position, that.position) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
