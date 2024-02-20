package com.company.juniorcrudservice.model.order.data;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("orders")
public class Order {

    @Id
    private Integer id;
    private LocalDate date;
    private Double cost;
    @MappedCollection(idColumn = "orders", keyColumn = "id")
    private List<Product> product;
}
