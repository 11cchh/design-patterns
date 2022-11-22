package com.hangzhou.design.structural.proxy.dynamic;

/**
 * @Author Faye
 * @Date 2022/11/22 16:06
 */
public class WomenTikTok implements TikTok, Game {
    @Override
    public void tiktok() {
        System.out.println("tiktok");
    }

    @Override
    public void game() {
        System.out.println("game");
    }
}
