package com.company.juniorcrudservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
