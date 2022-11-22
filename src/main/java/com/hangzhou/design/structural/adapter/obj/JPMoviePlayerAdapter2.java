package com.hangzhou.design.structural.adapter.obj;

import com.hangzhou.design.structural.adapter.Chinese2JapaneseTranslator;
import com.hangzhou.design.structural.adapter.Player;
import com.hangzhou.design.structural.adapter.Translator;

/**
 * @Author Faye
 * @Date 2022/11/21 17:54
 */
public class JPMoviePlayerAdapter2 implements Player {
    private Translator translator = new Chinese2JapaneseTranslator();
    private Player target;

    /**
     * 构造器
     * @param target Player
     */
    public JPMoviePlayerAdapter2(Player target) {
        this.target = target;
    }
    @Override
    public String play() {
        String content = target.play();
        String translateContent = translator.translate(content);
        System.out.println("日文翻译：" + translateContent);
        return translateContent;
    }
}
