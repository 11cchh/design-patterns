package com.hangzhou.design.behavioral.template;

/**
 * 机器人炒饭
 *
 * @Author Faye
 * @Date 2022/11/23 15:51
 */
public class MachineCook extends CookTemplate {
    @Override
    public void addFood() {
        System.out.println("放了三个小白菜");
    }

    @Override
    public void addSalt() {
        System.out.println("放了三勺盐");
    }
}
