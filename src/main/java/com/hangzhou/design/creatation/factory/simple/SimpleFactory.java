package com.hangzhou.design.creatation.factory.simple;

import com.hangzhou.design.creatation.factory.AbstractCar;
import com.hangzhou.design.creatation.factory.Car;
import com.hangzhou.design.creatation.factory.Truck;

/**
 * 简单工厂
 *
 * @Author Faye
 * @Date 2022/11/21 10:28
 */
public class SimpleFactory {
    /**
     * 根据类型创建产品
     * @param type 类型
     * @return 产品
     */
    public AbstractCar createCar(String type) {
        // 简单工厂的核心就在于当产品数量较少时能够应付，一切从简
        // 但是不满足开闭原则，一旦新增产品就得修改这部分代码而不是扩展新增一个类就可以
        if ("truck".equalsIgnoreCase(type)) {
            return new Truck();
        } else if ("car".equalsIgnoreCase(type)) {
            return new Car();
        }
        return null;
    }
}
