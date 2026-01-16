package com.gabs.dio.requests_orders.controller;

import com.gabs.dio.requests_orders.model.entity.Product;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default server URL")})
public interface ProductsController {

    @GetMapping
    ResponseEntity<List<Product>> getAllProducts();
}
