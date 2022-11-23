package com.hangzhou.design.structural.flyweight;

/**
 * 享元模式
 * 减少创建对象的数量，尝试重用现有的同类的对象
 * 与原型模式的区别是，享元是复用原来的对象，而原型是克隆出新的对象
 *
 * @Author Faye
 * @Date 2022/11/23 15:08
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractWaitressFlyweight waitress = WaitressPool.getWaitress(null);
        waitress.service();
        AbstractWaitressFlyweight waitress2 = WaitressPool.getWaitress(null);
        waitress2.service();
        waitress.end();
        AbstractWaitressFlyweight waitress3 = WaitressPool.getWaitress(null);
        System.out.println(waitress3.toString());
    }
}
