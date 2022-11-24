package com.hangzhou.design.behavioral.command;

/**
 * 抽象命令类
 * Controller、Service、Dao 接口
 *
 * @Author Faye
 * @Date 2022/11/24 15:18
 */
public interface Command {
    /**
     * 执行
     */
    void execute();
}
