package com.company.juniorcrudservice.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@RequiredArgsConstructor
public class OrderDto {

    private Integer id;
    private LocalDate date;
    private Double cost;
    private List<ProductDto> products;
}
