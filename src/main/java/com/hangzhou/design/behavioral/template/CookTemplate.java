package com.hangzhou.design.behavioral.template;

/**
 * 做饭模版
 *
 * @Author Faye
 * @Date 2022/11/23 15:49
 */
public abstract class CookTemplate {
    /**
     * 定义算法
     * 父类可以实现某些步骤
     * 留关键给子类
     */
    public void cook() {
        // 定义算法步骤
        heat();
        addFood();
        addSalt();
        stirFry();
        end();
    }

    // 加热方法
    public void heat() {
        System.out.println("开火...");
    }

    ;

    // 添加食物
    public abstract void addFood();

    // 加盐
    public abstract void addSalt();

    // 翻炒
    public void stirFry() {
        System.out.println("翻炒中...");
    }

    // 出锅
    public void end() {
        System.out.println("出锅...");
    }
}
