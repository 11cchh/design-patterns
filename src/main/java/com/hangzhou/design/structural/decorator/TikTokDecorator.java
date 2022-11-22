package com.hangzhou.design.structural.decorator;

/**
 * 抽象装饰器：直播装饰器
 * @Author Faye
 * @Date 2022/11/22 14:51
 */
public interface TikTokDecorator extends TikTok {
    /**
     * 增强方法
     */
    void enable();
}
