package com.hangzhou.design.structural.proxy.staticproxy;

/**
 * 静态代理模式就是装饰器模式
 * 如果要代理不同的接口则需要创建不同的静态代理类
 *
 * @Author Faye
 * @Date 2022/11/22 15:29
 */
public class MainTest {
    public static void main(String[] args) {
        TikTokProxy proxy = new TikTokProxy(new TikTok() {
            @Override
            public void tiktok() {
                System.out.println("tiktok...");
            }
        });
        proxy.tiktok();
    }
}
