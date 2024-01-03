package com.company.juniorcrudservice.service.order.jpa;

import com.company.juniorcrudservice.converter.OrderConverter;
import com.company.juniorcrudservice.dto.order.OrderDto;
import com.company.juniorcrudservice.mappers.OrderMapper;
import com.company.juniorcrudservice.model.order.jpa.Order;
import com.company.juniorcrudservice.repository.order.spring_jpa.OrderRepository;
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
    private final OrderMapper orderMapper;

    @Override
    public OrderDto getOrderById(Integer id) {
        Order order = orderRepository.findById(id).orElseThrow();
        return orderMapper.orderToOrderDto(order);
    }

    @Override
    public List<OrderDto> getOrders() {
        Iterable<Order> orders = orderRepository.findAll();
        return orderMapper.toOrderDtoList(orders);
    }

//    page - Page number
//    size - Page Size
//    sort - sort by(Order by column name)
//    direction - ASC / DESC
    @Override
    public Page<Order> getOrdersPage(Pageable pageable) {
        Page<Order> all = orderRepository.findAll(pageable);
        return all;
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
