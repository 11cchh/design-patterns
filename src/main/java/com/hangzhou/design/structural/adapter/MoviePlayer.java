package com.hangzhou.design.structural.adapter;

/**
 * 电影播放器
 * @Author Faye
 * @Date 2022/11/21 17:30
 */
public class MoviePlayer implements Player {
    @Override
    public String play() {
        System.out.println("正在播放：不能说的秘密.avi");
        String content = "你好";
        System.out.println(content);
        return content;
    }
}
