package com.hangzhou.design.structural.facade;

/**
 * 外观模式，门面模式
 * 向外屏蔽复杂系统的内部，提供可以访问系统一个接口，但不符合开闭原则，对修改关闭，对扩展开放
 *
 * @Author Faye
 * @Date 2022/11/23 10:38
 */
public class MainTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doThings("thing");
    }
}
