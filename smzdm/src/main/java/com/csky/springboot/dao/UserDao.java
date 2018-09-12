package com.csky.springboot.dao;

import com.csky.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    public User findUserById(int id);

    void register(User user);

    @Select("select * from `user` where name=#{name}")
    User findUserByName(@Param("name") String name);


    @Select("select * from `user` where name=#{name} and password=#{password}")
    User findUserByUser(User user);
}
