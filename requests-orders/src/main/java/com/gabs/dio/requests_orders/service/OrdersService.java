package com.gabs.dio.requests_orders.service;

import com.gabs.dio.requests_orders.model.dto.OrdersDTO;
import com.gabs.dio.requests_orders.model.entity.Orders;

public interface OrdersService {
    Orders makeOrders(OrdersDTO orders);
}
