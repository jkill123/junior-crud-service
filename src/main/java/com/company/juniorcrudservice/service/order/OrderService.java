package com.company.juniorcrudservice.service.order;


import com.company.juniorcrudservice.dto.order.OrderDto;
import com.company.juniorcrudservice.model.order.data.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {
    OrderDto getOrderById(Integer id);

    List<OrderDto> getOrders();

    List<OrderDto> getOrdersPage(Pageable pageable);

    void save(OrderDto dto);

    void update(Integer id, OrderDto dto);

    void delete(Integer id);
}
