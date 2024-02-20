package com.company.juniorcrudservice.repository.order.data;

import com.company.juniorcrudservice.model.order.data.Order;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Profile("!local")
public interface OrderRepository extends CrudRepository<Order, Integer> {

//    @Query("SELECT * FROM orders WHERE cost = :cost")
//    List<Order> findOrdersByCustomCostRestriction(Double cost);

//    List<Order> findOrdersByIdAndCostOrderByCost();

    Page<Order> findAll(Pageable pageable);
}
