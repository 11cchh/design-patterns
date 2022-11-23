package com.hangzhou.design.behavioral.strategy;

/**
 * 对外提供策略容器
 *
 * @Author Faye
 * @Date 2022/11/23 16:35
 */
public class StrategyContext {
    /**
     * 策略
     */
    private WorksheetStrategy worksheetStrategy;

    /**
     * 构造器
     *
     * @param worksheetStrategy 策略
     */
    public StrategyContext(WorksheetStrategy worksheetStrategy) {
        this.worksheetStrategy = worksheetStrategy;
    }

    /**
     * 调用策略中的方法
     *
     * @param o 对象
     */
    public void addWorksheet(Object o) {
        worksheetStrategy.addWorksheet(o);
    }
}
