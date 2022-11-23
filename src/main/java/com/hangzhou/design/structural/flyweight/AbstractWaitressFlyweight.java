package com.hangzhou.design.structural.flyweight;

/**
 * 定义抽象享元类
 * @Author Faye
 * @Date 2022/11/23 15:09
 */
public abstract class AbstractWaitressFlyweight {
    /**
     * 是否能够服务
     */
    Boolean serviceState = true;

    /**
     * 享元的不可共享属性留给具体类进行改变
     */
    abstract void service();

    /**
     * 享元的不可共享属性留给具体类进行改变
     */
    abstract void end();

    public Boolean getServiceState() {
        return this.serviceState;
    }
}
