package com.gabs.dio.requests_orders.faignClient;

import com.gabs.dio.requests_orders.model.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "products-catalog")
public interface ProductsFeignClient{

    @GetMapping(value = "/getAll")
    ResponseEntity<List<Product>> getList();

    @GetMapping(value = "/get/{id}")
    ResponseEntity<Product> getProduct(@PathVariable Long id);
}
