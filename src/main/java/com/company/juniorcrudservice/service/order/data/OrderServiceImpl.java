package com.company.juniorcrudservice.service.order.data;

import com.company.juniorcrudservice.converter.OrderConverter;
import com.company.juniorcrudservice.dto.OrderDto;
import com.company.juniorcrudservice.model.Order;
import com.company.juniorcrudservice.repository.OrderRepository;
import com.company.juniorcrudservice.service.order.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderConverter orderConverter;

    @Override
    public OrderDto getOrderById(Integer id) {
        Order order = orderRepository.findById(id).orElseThrow();
        return orderConverter.fromModel(order);
    }

    @Override
    public List<OrderDto> getOrders(Pageable pageable) {
        Page<Order> page = orderRepository.findAll(pageable);
        List<Order> orders = page.getContent();
        return orderConverter.fromModel(orders);
    }

    @Override
    public void save(OrderDto dto) {
        Order order = orderConverter.toModel(dto);
        orderRepository.save(order);
        log.debug("Order saved: " + order);
    }

    @Override
    public void update(Integer id, OrderDto dto) {
        Order old = orderRepository.findById(id).orElseThrow();
        Order updated = orderConverter.toModel(old, dto);
        orderRepository.save(updated);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
}
