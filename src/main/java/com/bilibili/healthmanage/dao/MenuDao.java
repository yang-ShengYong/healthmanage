package com.bilibili.healthmanage.dao;

import com.bilibili.healthmanage.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    List<MainMenu> getMenus();
}
