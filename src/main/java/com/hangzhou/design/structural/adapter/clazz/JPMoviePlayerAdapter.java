package com.hangzhou.design.structural.adapter.clazz;

import com.hangzhou.design.structural.adapter.Chinese2JapaneseTranslator;
import com.hangzhou.design.structural.adapter.Player;

/**
 * 新电影播放器
 *
 * @Author Faye
 * @Date 2022/11/21 17:33
 */
public class JPMoviePlayerAdapter extends Chinese2JapaneseTranslator implements Player {
    /**
     * 播放器
     */
    private Player target;

    /**
     * 构造器
     * @param target
     */
    public JPMoviePlayerAdapter(Player target) {
        this.target = target;
    }

    @Override
    public String play() {
        String content = target.play();
        String translateContent = translate(content);
        System.out.println("日文翻译：" + translateContent);
        return translateContent;
    }
}
