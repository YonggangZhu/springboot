package com.csky.springboot.controller;

import com.csky.springboot.bean.News;
import com.csky.springboot.bean.User;
import com.csky.springboot.bean.Vo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserController {

    @RequestMapping("/find")
    public String find(Model model){
        User user=new User(01,"zs","123","123","123");

        News news=new News(01,1,2,"www.baidu.com","aa",null,new Date());


        Vo vo=new Vo();
        vo.setUser(user);
        vo.setNews(news);
        vo.setLike(10);

        List<Vo> list=new ArrayList<>();
        list.add(vo);

        model.addAttribute("vos",list);
        return "home";
    }
}
