package com.hangzhou.design.creatation.factory.factorymethod;

import com.hangzhou.design.creatation.factory.AbstractCar;
import com.hangzhou.design.creatation.factory.Truck;

/**
 * 卡车工厂
 * @Author Faye
 * @Date 2022/11/21 10:53
 */
public class TruckFactory extends AbstractFactory{
    @Override
    public AbstractCar createProduct() {
        return new Truck();
    }
}
