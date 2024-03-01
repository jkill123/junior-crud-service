//package com.company.juniorcrudservice.mappers;
//
//import com.company.juniorcrudservice.dto.OrderDto;
//import com.company.juniorcrudservice.model.order.jpa.Order;
//import org.mapstruct.InjectionStrategy;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//import java.util.List;
//
//@Mapper(uses = {ProductMapper.class}, componentModel = "spring")
//public interface OrderMapper {
//
//    @Mapping(target = "product", source = "products")
//    Order orderDtoToOrder(OrderDto dto);
//    @Mapping(target = "products", source = "product")
//    OrderDto orderToOrderDto(Order order);
//
//    List<OrderDto> toOrderDtoList(Iterable<Order> orders);
//}
