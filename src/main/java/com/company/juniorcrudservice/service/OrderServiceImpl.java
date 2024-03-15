package com.company.juniorcrudservice.service;

import com.company.juniorcrudservice.dto.OrderDto;
import com.company.juniorcrudservice.mappers.OrderMapper;
import com.company.juniorcrudservice.model.Order;
import com.company.juniorcrudservice.repository.OrderRepository;
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
    private final OrderMapper orderMapper;

    @Override
    public OrderDto getOrderById(Integer id) {
        Order order = orderRepository.findById(id).orElseThrow();
        return orderMapper.orderToOrderDto(order);
    }

    @Override
    public List<OrderDto> getOrders(Pageable pageable) {
        Page<Order> page = orderRepository.findAll(pageable);
        List<Order> orders = page.getContent();
        return orderMapper.toOrderDtoList(orders);
    }

    @Override
    public void save(OrderDto dto) {
        Order order = orderMapper.orderDtoToOrder(dto);
        orderRepository.save(order);
        log.debug("Order saved: " + order);
    }

    @Override
    public void update(Integer id, OrderDto dto) {
        Order old = orderRepository.findById(id).orElseThrow();
        Order newOne = orderMapper.orderDtoToOrder(dto);

        orderMapper.update(old, newOne);
        orderRepository.save(old);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
}
