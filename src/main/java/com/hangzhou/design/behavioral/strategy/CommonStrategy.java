package com.hangzhou.design.behavioral.strategy;

/**
 * @Author Faye
 * @Date 2022/11/23 16:28
 */
public class CommonStrategy implements WorksheetStrategy {
    @Override
    public String getWorksheetType() {
        return "common";
    }

    @Override
    public String addWorksheet(Object o) {
        // do common things
        return "common";
    }
}
