package com.hangzhou.design.behavioral.strategy;

/**
 * 策略模式
 * 每种策略每种算法独立封装，根据不同情况使用不同算法策略，如下：工单策略
 *
 * @Author Faye
 * @Date 2022/11/23 16:27
 */
public interface WorksheetStrategy {
    /**
     * 工单类型
     *
     * @return 工单类型
     */
    String getWorksheetType();

    /**
     * 根据不同工单类型插入相对应的表
     *
     * @param o 工单Vo
     * @return 工单编码
     */
    String addWorksheet(Object o);
}
