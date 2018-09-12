package com.csky.springboot;

import com.csky.springboot.bean.User;
import com.csky.springboot.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootApplication.class)
@WebAppConfiguration
public class SpringbootApplicationTests {

    @Autowired
    UserDao dao;

    @Test
    public void contextLoads() {
        User user = dao.findUserById(1);
        System.out.println(user);
    }
}
