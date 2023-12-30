package com.company.juniorcrudservice.service.order;


import com.company.juniorcrudservice.dto.order.OrderDto;
import com.company.juniorcrudservice.model.order.jpa.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {
    OrderDto getOrderById(Integer id);

    List<OrderDto> getOrders();

    Page<Order> getOrdersPage(Pageable pageable);

    void save(OrderDto dto);

    void update(Integer id, OrderDto dto);

    void delete(Integer id);
}
