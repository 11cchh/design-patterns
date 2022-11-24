package com.hangzhou.design.behavioral.mediator;

/**
 * 中介者模式
 * 中介者模式和门面模式的区别在于，中介者模式可以双向操作，而门面模式偏向于封装某一方
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
