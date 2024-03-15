package com.company.juniorcrudservice.controller;

import com.company.juniorcrudservice.controller.response.ApiResponse;
import com.company.juniorcrudservice.dto.OrderDto;
import com.company.juniorcrudservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;

@RequiredArgsConstructor
@RequestMapping("/api/v1/orders")
@RestController
public class OrderController {

    private final OrderService orderService;

    @CrossOrigin("*")
    @GetMapping()
    public ApiResponse<List<OrderDto>> getOrders(@RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
                                                           @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
                                                           @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
                                                           @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        ApiResponse<List<OrderDto>> response = new ApiResponse<>();
        List<OrderDto> orders = orderService.getOrders(pageable);
        if (!isEmpty(orders)) {
            response.setSuccess(true);
            response.setData(orders);
        }
        return response;
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable("orderId") Integer orderId) {
        OrderDto order = orderService.getOrderById(orderId);
        if (order != null) {
            return ResponseEntity.ok(order);
        }
        return (ResponseEntity<OrderDto>) ResponseEntity.notFound();
    }

    @CrossOrigin("*")
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder(@RequestBody OrderDto orderDto) {
        orderService.save(orderDto);
    }

    @PutMapping("/{orderId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateOrderById(@PathVariable("orderId") Integer orderId, @RequestBody OrderDto orderDto) {
        orderService.update(orderId, orderDto);
    }

    @DeleteMapping("/{orderId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrderById(@PathVariable("orderId") Integer orderId) {
        orderService.delete(orderId);
    }
}
