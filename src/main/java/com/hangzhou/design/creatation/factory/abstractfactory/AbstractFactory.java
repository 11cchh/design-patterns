package com.hangzhou.design.creatation.factory.abstractfactory;

import com.hangzhou.design.creatation.factory.AbstractCar;

/**
 * 抽象工厂
 * @Author Faye
 * @Date 2022/11/21 10:50
 */
public abstract class AbstractFactory {
    /**
     * 创建车
     * @return 车
     */
    public abstract AbstractCar createCar();

    /**
     * 创建车
     * @return 车
     */
    public abstract AbstractMask createMask();
}
