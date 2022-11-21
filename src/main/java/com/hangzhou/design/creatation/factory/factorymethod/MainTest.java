package com.hangzhou.design.creatation.factory.factorymethod;

import com.hangzhou.design.creatation.factory.AbstractCar;

/**
 * 工厂方法模式
 * 将工厂抽象出来，虽然看上去是解决了简单工厂的违反开闭原则问题，但是系统复杂度增加，产品比较单一
 * @Author Faye
 * @Date 2022/11/21 10:54
 */
public class MainTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        AbstractCar car = carFactory.createProduct();

        TruckFactory truckFactory = new TruckFactory();
        AbstractCar truck = truckFactory.createProduct();

        car.drive();
        truck.drive();
    }
}
