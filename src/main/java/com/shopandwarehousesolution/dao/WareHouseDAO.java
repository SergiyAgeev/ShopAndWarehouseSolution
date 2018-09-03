package com.shopandwarehousesolution.dao;

import com.shopandwarehousesolution.entity.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
public interface WareHouseDAO extends JpaRepository<WareHouse,Integer> {
}
