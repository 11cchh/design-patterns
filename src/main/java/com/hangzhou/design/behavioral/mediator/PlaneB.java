package com.hangzhou.design.behavioral.mediator;

/**
 * @Author Faye
 * @Date 2022/11/23 17:53
 */
public class PlaneB implements Plane {
    private ControlTower controlTower;

    public void setControlTower(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void fly() {
        controlTower.acceptAction("fly");
        System.out.println("PlaneB fly...");
    }

    @Override
    public void land() {
        controlTower.acceptAction("land");
        System.out.println("PlaneB land...");
    }

    @Override
    public void success() {
        controlTower.acceptAction("success");
        System.out.println("PlaneB success...");
    }
}
