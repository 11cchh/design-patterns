package com.hangzhou.design.creatation.factory;

import lombok.Data;

/**
 * 抽象产品类
 *
 * @Author Faye
 * @Date 2022/11/21 10:26
 */
@Data
public abstract class AbstractCar {
    /**
     * 产品名称
     */
    public String name;

    /**
     * 产品功能
     */
    public abstract void drive();
}
