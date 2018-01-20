package com.jajahome.service.impl;

import com.jajahome.mapper.UserMapper;
import com.jajahome.po.User;
import com.jajahome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User selectUserByUserAndPass(User user) {
        return null;
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }
}
