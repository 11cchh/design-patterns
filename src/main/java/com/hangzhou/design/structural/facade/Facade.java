package com.hangzhou.design.structural.facade;

/**
 * 门面类
 * @Author Faye
 * @Date 2022/11/23 10:30
 */
public class Facade {
    private ServiceA serviceA = new ServiceA();
    private ServiceB serviceB = new ServiceB();
    private ServiceC serviceC = new ServiceC();

    public void doThings(String thing) {
        serviceA.doThings(thing);
        serviceB.doThings(thing);
        serviceC.doThings(thing);
    }
}
