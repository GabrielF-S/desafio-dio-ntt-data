package com.gabs.dio.requests_orders.controller.impl;

import com.gabs.dio.requests_orders.controller.ProductsController;
import com.gabs.dio.requests_orders.model.entity.Product;
import com.gabs.dio.requests_orders.service.ProductsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos/allProducts")
public class ProductsControllerImpl implements ProductsController {

    private final ProductsService service;

    public ProductsControllerImpl(ProductsService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<List<Product>> getAllProducts() {
        return  new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }
}
