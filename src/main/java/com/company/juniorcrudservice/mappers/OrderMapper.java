package com.company.juniorcrudservice.mappers;

import com.company.juniorcrudservice.dto.OrderDto;
import com.company.juniorcrudservice.model.Order;
import org.mapstruct.*;

import java.util.List;

@Mapper(uses = ProductMapper.class)
public interface OrderMapper {

    @Mapping(target = "product", source = "products")
    Order orderDtoToOrder(OrderDto dto);
    @Mapping(target = "products", source = "product")
    OrderDto orderToOrderDto(Order order);

    List<OrderDto> toOrderDtoList(Iterable<Order> orders);

    void update(@MappingTarget Order target, Order source);
}
