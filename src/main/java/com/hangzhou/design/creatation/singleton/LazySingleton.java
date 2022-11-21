package com.hangzhou.design.creatation.singleton;

/**
 * 懒汉式单例设计模式
 * @Author Faye
 * @Date 2022/11/19 18:17
 */
public class LazySingleton {
    /**
     * 单例对象
     */
    private volatile static LazySingleton instance;

    /**
     * 私有构造器
     */
    private LazySingleton() {}

    /**
     * double-check synchronized
     * @return instance
     */
    public static LazySingleton getLazySingleton() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
