package com.bilibili.healthmanage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.List;

/**
 * 主菜单
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MainMenu {
    private int id;
    private String title;
    private String path;
    private List<SubMenu> subMenuList;
}
