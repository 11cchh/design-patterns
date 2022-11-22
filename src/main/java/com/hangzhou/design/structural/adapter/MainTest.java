package com.hangzhou.design.structural.adapter;

import com.hangzhou.design.structural.adapter.clazz.JPMoviePlayerAdapter;
import com.hangzhou.design.structural.adapter.obj.JPMoviePlayerAdapter2;

/**
 * 适配器模式
 *
 * @Author Faye
 * @Date 2022/11/21 17:32
 */
public class MainTest {
    public static void main(String[] args) {
        MoviePlayer player = new MoviePlayer();
        player.play();

        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(player);
        adapter.play();

        JPMoviePlayerAdapter2 adapter2 = new JPMoviePlayerAdapter2(player);
        adapter2.play();
    }
}
