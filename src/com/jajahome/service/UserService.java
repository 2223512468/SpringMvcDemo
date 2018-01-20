package com.jajahome.service;

import com.jajahome.po.User;

public interface UserService {

    User selectUserByUserAndPass(User user);

    int insert(User record);
}
