package com.hangzhou.design.behavioral.mediator;

/**
 * 具体中介者
 * @Author Faye
 * @Date 2022/11/23 17:53
 */
public class ControlTower {
    private boolean flag = true;

    public void acceptAction(String action) {
        if ("fly".equalsIgnoreCase(action) || "land".equalsIgnoreCase(action)) {
            if (flag) {
                System.out.println("controlTower accept...");
                flag = false;
            } else {
                System.out.println("controlTower refuse...");
            }
        }
        if ("success".equalsIgnoreCase(action)) {
            flag = true;
        }
    }
}
