package com.company.juniorcrudservice.service.order.data;

import com.company.juniorcrudservice.converter.OrderConverter;
import com.company.juniorcrudservice.dto.order.OrderDto;
import com.company.juniorcrudservice.model.order.data.Order;
import com.company.juniorcrudservice.repository.order.data.OrderRepository;
import com.company.juniorcrudservice.service.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public List<OrderDto> getOrders() {
        Iterable<Order> orders = orderRepository.findAll();
        return orderConverter.fromModel(orders);
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
