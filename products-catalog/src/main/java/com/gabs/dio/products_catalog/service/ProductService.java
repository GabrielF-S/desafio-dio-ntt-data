package com.gabs.dio.products_catalog.service;

import com.gabs.dio.products_catalog.model.entity.Product;

import java.util.List;

public interface ProductService {
    Product registerProduct(Product product);

    Product getProductById(Long id);

    List<Product> getAll();
}
