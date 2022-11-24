package com.hangzhou.design.behavioral.observer;

/**
 * 具体观察者实现类
 *
 * @Author Faye
 * @Date 2022/11/24 10:09
 */
public class RobotFan extends AbstractFan {
    @Override
    void acceptMsg(String msg) {
        System.out.println("机器人接收：" + msg);
    }
}
