package com.shopandwarehousesolution.dao;

import com.shopandwarehousesolution.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
public interface ShopDAO extends JpaRepository<Shop,Integer> {
}
