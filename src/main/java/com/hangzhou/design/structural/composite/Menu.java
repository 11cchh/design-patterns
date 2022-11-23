package com.hangzhou.design.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 菜单
 *
 * @Author Faye
 * @Date 2022/11/23 10:44
 */
@Data
@AllArgsConstructor
public class Menu {
    private Integer id;
    private String name;
    /**
     * 组合模式关注点
     */
    private List<Menu> children;

    /**
     * 提供添加层级的方法
     * @param menu 菜单
     */
    public void addChildrenMenu(Menu menu) {
        children.add(menu);
    }

    /**
     * 提供遍历层级的方法
     */
    public void printMenu() {
        System.out.println("菜单：" + name);
        if (children!= null && children.size() > 0) {
            for (Menu child : children) {
                child.printMenu();
            }
        }
    }
}
