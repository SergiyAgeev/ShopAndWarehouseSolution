package com.shopandwarehousesolution.service.Impl;

import com.shopandwarehousesolution.dao.UserDAO;
import com.shopandwarehousesolution.entity.User;
import com.shopandwarehousesolution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sergiy Ageev on 01.09.2018.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserDAO udao;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findByUserName(String username) {
        return udao.findByUserName(username);
    }

    @Override
    public User findOne(int id) {
        return udao.findOne(id);
    }

    @Override
    public void delete(int id) {
        udao.delete(id);

    }

    @Override
    public void save(User user) {
        if  (user.getUsername()==null || user.getPassword()==null || user.getEmail()==null){
            System.out.println("ERROR GUYS");
        }else {
            String encodepassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encodepassword);
            udao.save(user);
        }


    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByUserName(username);
    }
}
