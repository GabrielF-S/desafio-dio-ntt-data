package com.gabs.dio.products_catalog.controller;


import com.gabs.dio.products_catalog.model.entity.Product;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default server URL")})
public interface ProductController {

    @PostMapping("/register")
    ResponseEntity<Product> registerProduct(@RequestBody Product product);

    @GetMapping("/get/{id}")
    ResponseEntity<Product> getProductById(@PathVariable Long id);

    @GetMapping("/getAll")
    ResponseEntity<List<Product>> getAllProdutcs();
}
