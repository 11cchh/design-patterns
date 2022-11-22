package com.hangzhou.design.structural.decorator;

/**
 * 待增强接口实现类
 * @Author Faye
 * @Date 2022/11/22 14:53
 */
public class WomenTikTok implements TikTok {
    @Override
    public void tiktok() {
        System.out.println("tiktok...");
    }
}
