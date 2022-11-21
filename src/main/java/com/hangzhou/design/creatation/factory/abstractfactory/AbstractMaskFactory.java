package com.hangzhou.design.creatation.factory.abstractfactory;

import com.hangzhou.design.creatation.factory.AbstractCar;

/**
 * 抽象口罩工厂
 * @Author Faye
 * @Date 2022/11/21 11:33
 */
public abstract class AbstractMaskFactory extends AbstractFactory {

    @Override
    public AbstractCar createCar() {
        return null;
    }

    abstract public AbstractMask createMask();
}
