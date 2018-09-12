package com.csky.springboot.service;

import com.csky.springboot.bean.User;

import java.util.Map;

public interface UserServiceinterface {
    Map registerUser(String username, String password);


    User findUserByUser(User user);
}
