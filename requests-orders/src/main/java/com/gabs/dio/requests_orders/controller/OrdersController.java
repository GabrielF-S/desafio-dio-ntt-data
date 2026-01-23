package com.gabs.dio.requests_orders.controller;

import com.gabs.dio.requests_orders.model.dto.OrdersDTO;
import com.gabs.dio.requests_orders.model.entity.Orders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface OrdersController {

    @PostMapping
    ResponseEntity<Orders> makeOrder( @RequestBody OrdersDTO orders);
}
