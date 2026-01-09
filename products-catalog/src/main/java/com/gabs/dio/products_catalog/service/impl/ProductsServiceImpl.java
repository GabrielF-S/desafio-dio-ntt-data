package com.gabs.dio.products_catalog.service.impl;

import com.gabs.dio.products_catalog.exceptions.ProductNotFoundException;
import com.gabs.dio.products_catalog.model.entity.Product;
import com.gabs.dio.products_catalog.model.repository.ProductRepository;
import com.gabs.dio.products_catalog.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductsServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product registerProduct(Product product) {
        Product save = repository.save(product);
        return save;
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException("Produto de ID:" + id + "não localizado"));
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }
}
