package com.gabs.dio.products_catalog.controller.impl;

import com.gabs.dio.products_catalog.controller.ProductController;
import com.gabs.dio.products_catalog.model.entity.Product;
import com.gabs.dio.products_catalog.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductControllerImpl implements ProductController {

    private final ProductService service;
    private final Environment env;
    private static Logger logger = LoggerFactory.getLogger(ProductController.class);

    public ProductControllerImpl(ProductService service, Environment env) {
        this.service = service;
        this.env = env;
    }

    @Override
    public ResponseEntity<Product> registerProduct(@RequestBody Product product) {
        logger.info(new StringBuilder().append("Port: ").append(env.getProperty("local.server.port")).toString());
        logger.info("Product: " + product.getProductName());
        return  new ResponseEntity<Product>(service.registerProduct(product), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Product> getProductById(Long id) {
        logger.info(new StringBuilder().append("Port: ").append(env.getProperty("local.server.port")).toString());
        return ResponseEntity.ok(service.getProductById(id));
    }

    @Override
    public ResponseEntity<List<Product>> getAllProdutcs() {
        logger.info("Port: "+ env.getProperty("local.server.port"));
        return ResponseEntity.ok(service.getAll());
    }
}
