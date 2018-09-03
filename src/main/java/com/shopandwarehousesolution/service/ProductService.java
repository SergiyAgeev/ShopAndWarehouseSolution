package com.shopandwarehousesolution.service;

import com.shopandwarehousesolution.entity.Product;


import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> findAll();
    Product findOne(int id);
    void delete(int id);
}
