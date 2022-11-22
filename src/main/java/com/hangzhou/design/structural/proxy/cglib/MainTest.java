package com.hangzhou.design.structural.proxy.cglib;

/**
 * cglib 代理
 *
 * @Author Faye
 * @Date 2022/11/22 17:07
 */
public class MainTest {
    public static void main(String[] args) {
        WomenTikTok tikTok = new WomenTikTok();
        WomenTikTok proxy = CglibProxy.createProxy(tikTok);
        proxy.tiktok();
    }
}
