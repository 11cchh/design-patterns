package com.hangzhou.design.behavioral.strategy;

/**
 * 工单策略
 * @Author Faye
 * @Date 2022/11/23 16:27
 */
public interface WorksheetStrategy {
    /**
     * 工单类型
     * @return 工单类型
     */
    String getWorksheetType();

    /**
     * 根据不同工单类型插入相对应的表
     * @param o 工单Vo
     * @return 工单编码
     */
    String addWorksheet(Object o);
}
