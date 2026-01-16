package com.gabs.dio.requests_orders.feignClient;

import com.gabs.dio.requests_orders.model.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "products-catalog", path = "/produtos" )
public interface ProductsFeignClient{

    @GetMapping(value = "/getAll")
    ResponseEntity<List<Product>> getList();

    @GetMapping(value = "/get/{id}")
    ResponseEntity<Product> getProduct(@PathVariable("id") Long id);
}
