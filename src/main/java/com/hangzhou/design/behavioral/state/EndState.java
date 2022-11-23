package com.hangzhou.design.behavioral.state;

/**
 * @Author Faye
 * @Date 2022/11/23 16:54
 */
public class EndState implements WorksheetState {
    @Override
    public String getWorksheetState() {
        return "end";
    }

    @Override
    public WorksheetState nextWorksheetState() {
        // do things
        return null;
    }
}
