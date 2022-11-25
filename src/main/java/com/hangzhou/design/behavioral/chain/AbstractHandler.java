package com.hangzhou.design.behavioral.chain;


/**
 * 抽象处理器
 *
 * @Author Faye
 * @Date 2022/11/24 17:11
 */
public abstract class AbstractHandler {
    /*
     * 下一个处理器
     */
    public AbstractHandler nextHandler;

    /**
     * 处理逻辑
     */
    public abstract void process(String str);

    /**
     * 手动设置下一个处理器，形成链
     *
     * @param handler 处理器
     */
    public void setNext(AbstractHandler handler) {
        this.nextHandler = handler;
    }
}
