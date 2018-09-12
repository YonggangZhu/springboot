package com.csky.springboot.controller;

import com.csky.springboot.bean.User;
import com.csky.springboot.service.UserServiceinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserServiceinterface userService;

    @RequestMapping("/login")
    @ResponseBody
    public Map login(String username, String password, String rember, HttpSession session){

        User user=new User();
        user.setPassword(password);
        user.setName(username);

        user=userService.findUserByUser(user);
        Map<String,Object> map=new HashMap<>();
        if (user==null){
            map.put("code",-1);
            map.put("msgname","用户名错误");
        }else {
            map.put("code",0);
            map.put("user",user);
        }

        if(rember.equals("1")){
            session.setAttribute("user",user);
        }

        return map;
    }


    @RequestMapping("/reg")
    @ResponseBody
    public Map register(String username, String password){
        return userService.registerUser(username,password);
    }
}
