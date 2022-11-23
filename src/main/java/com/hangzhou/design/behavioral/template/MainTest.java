package com.hangzhou.design.behavioral.template;

/**
 * 模板方法
 * 父类定义算法骨架，某些实现放在子类
 *
 * @Author Faye
 * @Date 2022/11/23 15:52
 */
public class MainTest {
    public static void main(String[] args) {
        MachineCook cook = new MachineCook();
        cook.cook();
    }
}
