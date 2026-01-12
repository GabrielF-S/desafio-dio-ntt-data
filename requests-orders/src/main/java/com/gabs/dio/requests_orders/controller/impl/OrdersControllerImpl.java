package com.gabs.dio.requests_orders.controller.impl;

import com.gabs.dio.requests_orders.controller.OrdersController;
import com.gabs.dio.requests_orders.model.dto.OrdersDTO;
import com.gabs.dio.requests_orders.model.entity.Orders;
import com.gabs.dio.requests_orders.service.OrdersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class OrdersControllerImpl implements OrdersController {
    private final OrdersService service;

    public OrdersControllerImpl(OrdersService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<Orders> makeOrder(OrdersDTO orders) {
        return new ResponseEntity<>(service.makeOrders(orders), HttpStatus.CREATED);
    }
}
