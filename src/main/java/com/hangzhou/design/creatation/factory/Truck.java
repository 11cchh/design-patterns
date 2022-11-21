package com.hangzhou.design.creatation.factory;

/**
 * 卡车
 *
 * @Author Faye
 * @Date 2022/11/21 10:29
 */
public class Truck extends AbstractCar {
    public Truck() {
        this.name = "卡车";
    }

    @Override
    public void drive() {
        System.out.println("卡车卡卡卡卡卡");
    }
}
