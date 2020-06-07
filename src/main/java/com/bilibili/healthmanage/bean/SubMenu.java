package com.bilibili.healthmanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 子菜单
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SubMenu {
    private int id;
    private String title;
    private String path;
}
