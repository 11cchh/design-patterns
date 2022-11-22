package com.hangzhou.design.structural.proxy.staticproxy;

/**
 * @Author Faye
 * @Date 2022/11/22 15:26
 */
public class TikTokProxy implements TikTok {
    /**
     * 被代理对象
     */
    private TikTok tikTok;

    public TikTokProxy(TikTok tikTok) {
        this.tikTok = tikTok;
    }

    @Override
    public void tiktok() {
        System.out.println("!!beauty!!");
        tikTok.tiktok();
    }
}
