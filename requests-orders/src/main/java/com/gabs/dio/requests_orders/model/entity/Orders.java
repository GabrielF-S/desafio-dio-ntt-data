package com.gabs.dio.requests_orders.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
@Builder
@Data
public class Orders {
    private Long id;
    private List<Product> products;
    @JsonFormat(pattern = "dd/MM/yy HH:mm")
    private LocalDateTime dateTime;

    public Orders(Long id, List<Product> products, LocalDateTime dateTime) {
        this.id = id;
        this.products = products;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
