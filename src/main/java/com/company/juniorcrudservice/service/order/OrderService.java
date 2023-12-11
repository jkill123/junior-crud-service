package com.company.juniorcrudservice.service.order;


import com.company.juniorcrudservice.dto.order.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto getOrderById(Integer id);

    List<OrderDto> getOrders();

    void save(OrderDto dto);

    void update(Integer id, OrderDto dto);

    void delete(Integer id);
}
