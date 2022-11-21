package com.hangzhou.design.creatation.factory.factorymethod;

import com.hangzhou.design.creatation.factory.AbstractCar;
import com.hangzhou.design.creatation.factory.Car;

/**
 * 汽车工厂
 *
 * @Author Faye
 * @Date 2022/11/21 10:52
 */
public class CarFactory extends AbstractFactory {
    @Override
    public AbstractCar createProduct() {
        return new Car();
    }
}
