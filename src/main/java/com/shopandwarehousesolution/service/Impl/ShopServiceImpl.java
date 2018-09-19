package com.shopandwarehousesolution.service.Impl;

import com.shopandwarehousesolution.dao.ShopDAO;
import com.shopandwarehousesolution.entity.Shop;

import com.shopandwarehousesolution.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDAO sdao;

    @Override
    public void save(Shop shop) {
        sdao.save(shop);
    }

    @Override
    public List<Shop> findAll() {
        return sdao.findAll();
    }

    @Override
    public Shop findOne(int id) {
        return sdao.findOne(id);
    }

    @Override
    public void delete(int id) {
        sdao.delete(id);
    }
}
