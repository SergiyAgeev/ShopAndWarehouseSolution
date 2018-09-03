package com.shopandwarehousesolution.service;

import com.shopandwarehousesolution.entity.User;

import java.util.List;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
public interface UserService {
    void save(User user);
    List<User> findAll();
    User findByUserName(String name);
    User findOne(int id);
    void delete(int id);
}
