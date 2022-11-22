package com.hangzhou.design.structural.adapter;

/**
 * @Author Faye
 * @Date 2022/11/21 17:39
 */
public class Chinese2JapaneseTranslator implements Translator {
    @Override
    public String translate(String content) {
        if ("你好".equalsIgnoreCase(content)) {
            return "kounijiwa";
        }
        return null;
    }
}
