package com.company.juniorcrudservice.repository.order.data;

import com.company.juniorcrudservice.model.order.data.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
