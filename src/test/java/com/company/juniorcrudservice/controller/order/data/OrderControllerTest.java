package com.company.juniorcrudservice.controller.order.data;

import com.company.juniorcrudservice.dto.OrderDto;
import com.company.juniorcrudservice.model.Order;
import com.company.juniorcrudservice.model.Product;
import com.company.juniorcrudservice.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class OrderControllerTest {

    @Value("${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    void shouldGetOrderById() {
        Order order = Order.builder()
                .date(LocalDate.now())
                .cost(31.1)
                .product(List.of(Product.builder()
                        .cost(22.2)
                        .name("test")
                        .build()))
                .build();
        Order savedOrder = orderRepository.save(order);
        String url = "http://localhost:" + port + "/api/v1/orders/" + savedOrder.getId();

        OrderDto result = restTemplate.getForObject(url, OrderDto.class);
//        ResponseEntity<OrderDto> exchange = restTemplate.exchange(url, HttpMethod.GET, null, OrderDto.class);

        assertEquals(savedOrder.getId(), result.getId());
    }
}
