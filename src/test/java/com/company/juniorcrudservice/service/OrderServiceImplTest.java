package com.company.juniorcrudservice.service;

import com.company.juniorcrudservice.dto.OrderDto;
import com.company.juniorcrudservice.mappers.OrderMapper;
import com.company.juniorcrudservice.model.Order;
import com.company.juniorcrudservice.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderServiceImplTest {

    private static final int ORDER_ID = 111;

    @InjectMocks
    private OrderServiceImpl testInstance;

    @Mock
    private OrderRepository orderRepository;

    @Mock
    private OrderMapper orderMapper;

    @Mock
    private Order order;

    private OrderDto dto;

    @BeforeEach
    public void init() {
        dto = new OrderDto();
        dto.setId(ORDER_ID);
        dto.setCost(11.1);
    }

    @Test
    void shouldReturnOrderById() {
        when(orderRepository.findById(anyInt())).thenReturn(Optional.of(order));
        when(orderMapper.orderToOrderDto(order)).thenReturn(dto);

        OrderDto result = testInstance.getOrderById(ORDER_ID);

        verify(orderRepository).findById(ORDER_ID);
        verify(orderMapper).orderToOrderDto(order);
        assertNotNull(result);
        assertEquals(ORDER_ID, result.getId());
    }

    @Test
    void shouldNotReturnOrderById() {
        assertThrows(NoSuchElementException.class, () -> testInstance.getOrderById(ORDER_ID));
    }
}
