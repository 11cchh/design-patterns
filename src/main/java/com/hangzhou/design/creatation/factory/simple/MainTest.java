package com.hangzhou.design.creatation.factory.simple;

import com.hangzhou.design.creatation.factory.Car;
import com.hangzhou.design.creatation.factory.Truck;

/**
 * 简单工厂模式
 * 一切从简，但不符合开闭原则，不便于扩展
 * @Author Faye
 * @Date 2022/11/21 10:03
 */
public class MainTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = (Car) simpleFactory.createCar("car");
        Truck truck = (Truck) simpleFactory.createCar("TRUCK");
        car.drive();
        truck.drive();
    }
}
