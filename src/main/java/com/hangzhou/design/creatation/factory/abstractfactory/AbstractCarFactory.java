package com.hangzhou.design.creatation.factory.abstractfactory;

import com.hangzhou.design.creatation.factory.AbstractCar;

/**
 * 抽象汽车工厂
 * @Author Faye
 * @Date 2022/11/21 11:35
 */
public abstract class AbstractCarFactory extends AbstractFactory {
    /**
     * 创建车
     *
     * @return AbstractCar
     */
    @Override
    abstract public AbstractCar createCar();

    @Override
    public AbstractMask createMask() {
        return null;
    }
}
