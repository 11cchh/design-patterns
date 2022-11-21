package com.hangzhou.design.creatation.factory.abstractfactory;

import lombok.Data;

/**
 * @Author Faye
 * @Date 2022/11/21 11:47
 */
@Data
public abstract class AbstractMask {
    /**
     * 价格
     */
    public Integer price;

    /**
     * 口罩功能
     */
    public abstract void protect();
}
