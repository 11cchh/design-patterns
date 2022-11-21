package com.hangzhou.design.creatation.factory.abstractfactory;

import com.hangzhou.design.creatation.factory.AbstractCar;

/**
 * 抽象工厂模式
 * 相对比工厂方法模式，将抽象工厂再抽象化
 *
 * @Author Faye
 * @Date 2022/11/21 13:49
 */
public class MainTest {
    public static void main(String[] args) {
        // 根据需求创建需要对象
        AbstractFactory factory = new CarFactory();
        AbstractCar car = factory.createCar();
        car.drive();

        factory = new MaskFactory();
        AbstractMask mask = factory.createMask();
        mask.protect();
    }
}
