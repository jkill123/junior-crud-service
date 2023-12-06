package com.company.juniorcrudservice.service.order;


import com.company.juniorcrudservice.dto.OrderDto;
import com.company.juniorcrudservice.model.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Integer id);

    List<Order> getOrders();

    void save(OrderDto dto);

    void update(Integer id, OrderDto dto);

    void delete(Integer id);
}
