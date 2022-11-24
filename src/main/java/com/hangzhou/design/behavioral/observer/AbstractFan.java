package com.hangzhou.design.behavioral.observer;

/**
 * 抽象观察者
 *
 * @Author Faye
 * @Date 2022/11/24 10:00
 */
public abstract class AbstractFan {
    abstract void acceptMsg(String msg);

    void follow(AbstractTikToker tikToker) {
        tikToker.addFan(this);
    };
}
