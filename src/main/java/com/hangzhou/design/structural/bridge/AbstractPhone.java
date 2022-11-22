package com.hangzhou.design.structural.bridge;

/**
 * 抽象手机类
 * @Author Faye
 * @Date 2022/11/22 11:19
 */
public abstract class AbstractPhone {
    /**
     * 抽象销售渠道
     * 桥接模式的核心在于将会引起类变化的维度抽取出来，通过组合的方式拼接
     */
    AbstractSale sale;

    abstract String getPhone();

    public void setSale(AbstractSale sale) {
        this.sale = sale;
    }
}
