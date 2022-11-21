package com.hangzhou.design.creatation.factory.abstractfactory;

import com.hangzhou.design.creatation.factory.AbstractCar;
import com.hangzhou.design.creatation.factory.Car;

/**
 * 具体汽车工厂
 * @Author Faye
 * @Date 2022/11/21 11:37
 */
public class CarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar createCar() {
        return new Car();
    }
}
