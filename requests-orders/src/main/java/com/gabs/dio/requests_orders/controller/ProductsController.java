package com.gabs.dio.requests_orders.controller;

import com.gabs.dio.requests_orders.model.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProductsController {

    @GetMapping
    ResponseEntity<List<Product>> getAllProducts();
}
