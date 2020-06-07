package com.bilibili.healthmanage.controller;

import com.alibaba.fastjson.JSON;
import com.bilibili.healthmanage.bean.User;
import com.bilibili.healthmanage.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user) {
        User userRes = userDao.getUserByMessage(user.getUsername(), user.getPassword());
        Map<String, Object> res = new HashMap<>();
        String status = "error";
        if (userRes != null) {
            status = "ok";
        }
        res.put("status", status);
        res.put("user", user);
        String resJson = JSON.toJSONString(res);
        return resJson;
    }

}
