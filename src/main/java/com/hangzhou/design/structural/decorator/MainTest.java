package com.hangzhou.design.structural.decorator;

/**
 * 装饰器模式
 * 相比于适配器模式，装饰器模式只关心增强这个类的方法，而适配器模式是关心两个原本不兼容的接口
 *
 * @Author Faye
 * @Date 2022/11/22 14:50
 */
public class MainTest {
    public static void main(String[] args) {
        WomenTikTok tikTok = new WomenTikTok();
        tikTok.tiktok();

        WomenTikTokDecorator tikTokDecorator = new WomenTikTokDecorator(tikTok);
        tikTokDecorator.tiktok();
    }
}
