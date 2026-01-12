package com.gabs.dio.requests_orders.service.impl;

import com.gabs.dio.requests_orders.faignClient.ProductsFeignClient;
import com.gabs.dio.requests_orders.model.dto.OrdersDTO;
import com.gabs.dio.requests_orders.model.entity.Orders;
import com.gabs.dio.requests_orders.model.entity.Product;
import com.gabs.dio.requests_orders.service.OrdersService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class OrdersServiceImpl implements OrdersService {

    private final ProductsFeignClient feignClient;

    public OrdersServiceImpl(ProductsFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public Orders makeOrders(OrdersDTO orders) {
        List<Product> productList = orders.getProductsIdList().stream().map(p -> feignClient.getProduct(p).getBody()).toList();
        Orders newOrder = new Orders( new Random().nextLong(), productList, LocalDateTime.now());
        return newOrder;

    }
}






