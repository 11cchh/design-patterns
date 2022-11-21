package com.hangzhou.design.creatation.factory;

/**
 * 普通汽车
 *
 * @Author Faye
 * @Date 2022/11/21 10:31
 */
public class Car extends AbstractCar {
    public Car() {
        this.name = "普通汽车";
    }

    @Override
    public void drive() {
        System.out.println("汽车嘟嘟嘟嘟嘟");
    }
}
