package com.shopandwarehousesolution.dao;

import com.shopandwarehousesolution.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
public interface UserDAO extends JpaRepository<User,Integer> {
    @Query("from User u where u.username=:username")
    User findByUserName(@Param("username") String name);

}
