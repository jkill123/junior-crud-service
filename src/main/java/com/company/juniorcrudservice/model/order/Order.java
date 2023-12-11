//package com.company.juniorcrudservice.model.order;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "orders")
//public class Order {
//
//    @Id
//    @GeneratedValue
//    private Integer id;
//    private LocalDate date;
//    private Double cost;
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Product> product;
//    private LocalDate created;
//    private LocalDate lastUpdated;
//}
