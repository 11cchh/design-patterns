package com.hangzhou.design.behavioral.mediator;

/**
 * @Author Faye
 * @Date 2022/11/23 17:52
 */
public class PlaneA implements Plane {
    private ControlTower controlTower;

    public void setControlTower(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void fly() {
        controlTower.acceptAction("fly");
        System.out.println("PlaneA fly...");
    }

    @Override
    public void land() {
        controlTower.acceptAction("land");
        System.out.println("PlaneA land...");
    }

    @Override
    public void success() {
        controlTower.acceptAction("success");
        System.out.println("PlaneA success...");
    }
}
