package com.shopandwarehousesolution.dao;

import com.shopandwarehousesolution.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
public interface ProductDAO extends JpaRepository<Product,Integer> {
}
