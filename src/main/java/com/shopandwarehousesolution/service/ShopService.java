package com.shopandwarehousesolution.service;

import com.shopandwarehousesolution.entity.Shop;


import java.util.List;

public interface ShopService {
    void save(Shop shop);
    List<Shop> findAll();
    Shop findOne(int id);
    void delete(int id);
}
