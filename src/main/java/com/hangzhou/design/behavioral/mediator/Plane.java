package com.hangzhou.design.behavioral.mediator;

/**
 * 抽象同事类
 *
 * @Author Faye
 * @Date 2022/11/23 17:51
 */
public interface Plane {
    /**
     * 起飞
     */
    void fly();

    /**
     * 降落
     */
    void land();

    /**
     * 完成
     */
    void success();
}
