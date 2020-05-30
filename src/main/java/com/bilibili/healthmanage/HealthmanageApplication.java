package com.bilibili.healthmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bilibili.healthmanage.dao")
@SpringBootApplication
public class HealthmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthmanageApplication.class, args);
    }

}
