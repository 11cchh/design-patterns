package com.hangzhou.design.behavioral.observer;

/**
 * 观察者模式
 * 当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新
 *
 * @Author Faye
 * @Date 2022/11/24 10:10
 */
public class MainTest {
    public static void main(String[] args) {
        TikToker tikToker = new TikToker();
        HumanFan humanFan = new HumanFan();
        RobotFan robotFan = new RobotFan();

        tikToker.addFan(humanFan);
        tikToker.addFan(robotFan);
        tikToker.notifyFan("开始直播！");
    }
}
