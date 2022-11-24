package com.hangzhou.design.behavioral.observer;

/**
 * 抽象被观察者
 *
 * @Author Faye
 * @Date 2022/11/24 10:03
 */
public abstract class AbstractTikToker {
    /**
     * 添加观察者
     *
     * @param fan 观察者
     */
    abstract void addFan(AbstractFan fan);

    /**
     * 通知观察者
     *
     * @param msg 通知
     */
    abstract void notifyFan(String msg);
}
