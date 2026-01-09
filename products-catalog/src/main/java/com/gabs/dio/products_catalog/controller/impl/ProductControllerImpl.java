package com.gabs.dio.products_catalog.controller.impl;

import com.gabs.dio.products_catalog.controller.ProductController;
import com.gabs.dio.products_catalog.model.entity.Product;
import com.gabs.dio.products_catalog.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductControllerImpl implements ProductController {

    private final ProductService service;

    public ProductControllerImpl(ProductService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<Product> registerProduct(Product product) {
        return  new ResponseEntity<Product>(service.registerProduct(product), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Product> getProductById(Long id) {
        return ResponseEntity.ok(service.getProductById(id));
    }

    @Override
    public ResponseEntity<List<Product>> getAllProdutcs() {
        return ResponseEntity.ok(service.getAll());
    }
}
