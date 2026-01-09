package com.gabs.dio.products_catalog.model.repository;

import com.gabs.dio.products_catalog.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
