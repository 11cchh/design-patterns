package com.hangzhou.design.behavioral.strategy;

/**
 * @Author Faye
 * @Date 2022/11/23 16:28
 */
public class SpecialStrategy implements WorksheetStrategy {
    @Override
    public String getWorksheetType() {
        return "special";
    }

    @Override
    public String addWorksheet(Object o) {
        return "special";
    }
}
