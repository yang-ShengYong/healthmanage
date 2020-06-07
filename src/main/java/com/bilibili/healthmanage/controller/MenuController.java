package com.bilibili.healthmanage.controller;

import com.alibaba.fastjson.JSON;
import com.bilibili.healthmanage.bean.MainMenu;
import com.bilibili.healthmanage.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MenuController {
    @Autowired
    MenuDao menuDao;

    @RequestMapping("/menus")
    public String getAllMenus() {
        Map<String, Object> data = new HashMap<>();
        List<MainMenu> menus = menuDao.getMenus();
        if (menus != null) {
            data.put("status", "ok");
            data.put("menus", menus);
        } else {
            data.put("status", "error");
        }
        String res = JSON.toJSONString(data);
        return res;
    }
}
