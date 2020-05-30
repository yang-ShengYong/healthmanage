package com.bilibili.healthmanage.dao;

import com.bilibili.healthmanage.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUserByMessage(@Param("username") String username, @Param("password") String password);
}
