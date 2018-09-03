package com.shopandwarehousesolution.service;


import com.shopandwarehousesolution.entity.WareHouse;

import java.util.List;

public interface WarehouseService {
    void save(WareHouse wareHouse);
    List<WareHouse> findAll();
    WareHouse findOne(int id);
    void delete(int id);
}
