package com.hangzhou.design.behavioral.state;

/**
 * 状态模式
 * 对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为
 * 与策略模式不同的是，状态模式侧重于状态的切换
 *
 * @Author Faye
 * @Date 2022/11/23 16:54
 */
public class MainTest {
    public static void main(String[] args) {
        // 根据状态获取对应的状态类
        StartState startState = new StartState();
        System.out.println(startState.getWorksheetState());
        System.out.println(startState.nextWorksheetState().getWorksheetState());
    }
}
