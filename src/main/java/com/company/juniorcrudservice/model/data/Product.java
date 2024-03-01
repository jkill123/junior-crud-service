package com.company.juniorcrudservice.model.data;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    private Integer id;
    private String name;
    private Double cost;

}
