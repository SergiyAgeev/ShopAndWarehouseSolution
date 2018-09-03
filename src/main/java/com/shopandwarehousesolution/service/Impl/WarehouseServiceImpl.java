package com.shopandwarehousesolution.service.Impl;

import com.shopandwarehousesolution.dao.WareHouseDAO;
import com.shopandwarehousesolution.entity.WareHouse;
import com.shopandwarehousesolution.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WareHouseDAO wdao;

    @Override
    public void save(WareHouse wareHouse) {
    wdao.save(wareHouse);
    }

    @Override
    public List<WareHouse> findAll() {
        return wdao.findAll();
    }

    @Override
    public WareHouse findOne(int id) {
        return wdao.findOne(id);
    }

    @Override
    public void delete(int id) {
        wdao.delete(id);
    }
}
