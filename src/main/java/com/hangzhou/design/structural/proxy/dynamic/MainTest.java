package com.hangzhou.design.structural.proxy.dynamic;

/**
 * 动态代理模式
 * JDK 要求被代理对象必须要有接口
 * 和静态代理相比，静态代理如果要代理不同的接口则需要创建不同的静态代理类
 *
 * @Author Faye
 * @Date 2022/11/22 15:47
 */
public class MainTest {
    public static void main(String[] args) {
        TikTok tikTok = new WomenTikTok();
        TikTok proxy = JDKTikTokProxy.getProxy(tikTok);
        proxy.tiktok();

        Game game = new WomenTikTok();
        Game gameProxy = JDKTikTokProxy.getProxy(game);
        gameProxy.game();
    }
}
