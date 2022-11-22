package com.hangzhou.design.structural.decorator;

/**
 * 增强接口实现类
 * @Author Faye
 * @Date 2022/11/22 14:56
 */
public class WomenTikTokDecorator implements TikTokDecorator {
    private WomenTikTok womenTikTok;
    public WomenTikTokDecorator(WomenTikTok womenTikTok) {
        this.womenTikTok = womenTikTok;
    }
    @Override
    public void tiktok() {
        enable();
        womenTikTok.tiktok();
    }

    @Override
    public void enable() {
        System.out.println("!enable beauty!");
    }
}
