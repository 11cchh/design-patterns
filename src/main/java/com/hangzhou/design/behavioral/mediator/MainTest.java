package com.hangzhou.design.behavioral.mediator;

/**
 * 中介者模式
 *
 * @Author Faye
 * @Date 2022/11/23 17:56
 */
public class MainTest {
    public static void main(String[] args) {
        PlaneA planeA = new PlaneA();
        PlaneB planeB = new PlaneB();

        ControlTower controlTower = new ControlTower();
        planeA.setControlTower(controlTower);
        planeB.setControlTower(controlTower);

        planeA.fly();
    }
}
