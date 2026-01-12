package com.gabs.dio.requests_orders.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrdersDTO {

    private List<Long> productsIdList;

    public List<Long> getProductsIdList() {
        return productsIdList;
    }

    public void setProductsIdList(List<Long> productsIdList) {
        this.productsIdList = productsIdList;
    }
}
