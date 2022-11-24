package com.hangzhou.design.behavioral.observer;

/**
 * @Author Faye
 * @Date 2022/11/24 10:10
 */
public class HumanFan extends AbstractFan {
    @Override
    void acceptMsg(String msg) {
        System.out.println("人类接收：" + msg);
    }
}
