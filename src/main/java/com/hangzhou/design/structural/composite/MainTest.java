package com.hangzhou.design.structural.composite;

import java.util.ArrayList;

/**
 * 组合模式
 *
 * @Author Faye
 * @Date 2022/11/23 11:05
 */
public class MainTest {
    public static void main(String[] args) {
        Menu menu1 = new Menu(1, "1", new ArrayList<>());
        Menu menu2 = new Menu(2, "2", new ArrayList<>());
        Menu menu3 = new Menu(3, "3", new ArrayList<>());
        Menu menu4 = new Menu(4, "4", new ArrayList<>());

        menu1.addChildrenMenu(menu2);
        menu2.addChildrenMenu(menu3);
        menu2.addChildrenMenu(menu4);
        menu1.printMenu();
    }
}
