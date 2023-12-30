package com.company.juniorcrudservice.repository.order.spring_jpa;

import com.company.juniorcrudservice.model.order.jpa.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
