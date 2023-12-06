package com.company.juniorcrudservice.service.order;

import com.company.juniorcrudservice.dto.OrderDto;
import com.company.juniorcrudservice.model.Order;
import com.company.juniorcrudservice.model.Product;
import com.company.juniorcrudservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order getOrderById(Integer id) {
        return null;
    }

    @Override
    public List<Order> getOrders() {
        return null;
    }

    @Override
    public void save(OrderDto dto) {
        Order order = new Order();
        order.setCost(10.0);
        order.setDate(LocalDate.now());

        Product product = new Product();
        product.setName("one23");
        product.setCost(12.2);

        Product product2 = new Product();
        product2.setName("two23");
        product2.setCost(14.2);

        order.setProduct(List.of(product, product2));

        orderRepository.save(order);
    }

    @Override
    public void update(Integer id, OrderDto dto) {

    }

    @Override
    public void delete(Integer id) {

    }
}
