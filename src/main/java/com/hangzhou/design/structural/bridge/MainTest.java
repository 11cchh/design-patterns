package com.hangzhou.design.structural.bridge;

/**
 * 桥接模式的核心在于将会引起类变化的维度抽取出来，通过组合的方式拼接
 * @Author Faye
 * @Date 2022/11/22 11:26
 */
public class MainTest {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        OnlineSale onlineSale = new OnlineSale("线上", 20);
        OfflineSale offlineSale = new OfflineSale("线下", 10);

        iPhone.setSale(onlineSale);
        System.out.println(iPhone.getPhone());

        iPhone.setSale(offlineSale);
        System.out.println(iPhone.getPhone());

    }
}
