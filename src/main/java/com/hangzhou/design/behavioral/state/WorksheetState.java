package com.hangzhou.design.behavioral.state;

/**
 * @Author Faye
 * @Date 2022/11/23 16:51
 */
public interface WorksheetState {
    /**
     * 获取当前工单状态
     *
     * @return 工单状态
     */
    String getWorksheetState();

    /**
     * 当前工单状态扭转到下个工单状态
     */
    WorksheetState nextWorksheetState();
}
