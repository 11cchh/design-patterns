package com.hangzhou.design.creatation.factory.factorymethod;

import com.hangzhou.design.creatation.factory.AbstractCar;

/**
 * 工厂方法
 * @Author Faye
 * @Date 2022/11/21 10:50
 */
public abstract class AbstractFactory {
    /**
     * 创建产品
     * @return 产品
     */
    public abstract AbstractCar createProduct();
}
