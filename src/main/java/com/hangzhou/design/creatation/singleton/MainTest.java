package com.hangzhou.design.creatation.singleton;

/**
 * 单例模式应用场景：
 * 1. 多线程中的连接池
 * 2. 数据库的连接池
 * 3. 系统的环境信息
 * 4. 上下文
 *
 * @Author Faye
 * @Date 2022/11/18 17:52
 */
public class MainTest {
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getLazySingleton();
        LazySingleton singleton2 = LazySingleton.getLazySingleton();
        System.out.println(singleton1 == singleton2);
    }
}
