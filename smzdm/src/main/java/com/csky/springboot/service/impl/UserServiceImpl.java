package com.csky.springboot.service.impl;

import com.csky.springboot.bean.User;
import com.csky.springboot.dao.UserDao;
import com.csky.springboot.service.UserServiceinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserServiceinterface {

    @Autowired
    UserDao dao;

    @Override
    public Map registerUser(String username, String password) {
        Map<String,Object> map=new HashMap<>();

        User user=new User();
        user.setName(username);
        user.setPassword(password);

        //查询用户名是否存在
        User user1=dao.findUserByName(username);
        if(user1!=null){
            map.put("msgname","用户名已存在");
            map.put("code",-1);
            return map;
        }else {
            dao.register(user);
            map.put("code",0);
        }
        return map;
    }

    @Override
    public User findUserByName(String username) {
        User user=dao.findUserByName(username);
        return user;
    }
}
