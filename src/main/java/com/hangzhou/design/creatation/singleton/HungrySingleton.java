package com.hangzhou.design.creatation.singleton;

/**
 * 饿汉式单例设计模式
 * @Author Faye
 * @Date 2022/11/19 18:20
 */
public class HungrySingleton {
    /**
     * 单例对象
     */
    private static final HungrySingleton instance = new HungrySingleton();

    /**
     * 私有构造器
     */
    private HungrySingleton() {}

    /**
     * getHungrySingleton
     * @return instance
     */
    private static HungrySingleton getHungrySingleton() {
        return instance;
    }
}
