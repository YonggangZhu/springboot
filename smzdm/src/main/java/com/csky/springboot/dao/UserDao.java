package com.csky.springboot.dao;

import com.csky.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public User findUserById(int id);

}
