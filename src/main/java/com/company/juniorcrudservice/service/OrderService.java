package com.company.juniorcrudservice.service;


import com.company.juniorcrudservice.dto.OrderDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {
    OrderDto getOrderById(Integer id);

    List<OrderDto> getOrders(Pageable pageable);

    void save(OrderDto dto);

    void update(Integer id, OrderDto dto);

    void delete(Integer id);
}
