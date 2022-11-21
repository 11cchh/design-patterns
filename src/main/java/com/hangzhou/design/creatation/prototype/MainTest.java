package com.hangzhou.design.creatation.prototype;

/**
 * 原型模式（暂时不知道在实际开发中有什么用）
 * @Author Faye
 * @Date 2022/11/21 09:52
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Faye", 1);
        System.out.println("sheep:" + sheep);
        Sheep clone2 = (Sheep) sheep.clone();

        System.out.println("sheep:" + sheep);
        System.out.println("clone:" + clone2);
        System.out.println(sheep == clone2);
    }
}
