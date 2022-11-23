package com.hangzhou.design.behavioral.state;

/**
 * @Author Faye
 * @Date 2022/11/23 16:53
 */
public class StartState implements WorksheetState {
    @Override
    public String getWorksheetState() {
        return "start";
    }

    @Override
    public WorksheetState nextWorksheetState() {
        // do things
        return new EndState();
    }
}
