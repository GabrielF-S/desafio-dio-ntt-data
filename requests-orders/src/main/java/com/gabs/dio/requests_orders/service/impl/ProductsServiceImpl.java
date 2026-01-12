package com.gabs.dio.requests_orders.service.impl;

import com.gabs.dio.requests_orders.faignClient.ProductsFeignClient;
import com.gabs.dio.requests_orders.model.entity.Product;
import com.gabs.dio.requests_orders.service.ProductsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductsServiceImpl implements ProductsService {

    private final ProductsFeignClient feignClient;

    public ProductsServiceImpl(ProductsFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public List<Product> getAllProducts() {
        return feignClient.getList().getBody();
    }
}
