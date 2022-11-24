package com.hangzhou.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者实现类
 * @Author Faye
 * @Date 2022/11/24 10:08
 */
public class TikToker extends AbstractTikToker {

    private List<AbstractFan> fans = new ArrayList<>();

    @Override
    void addFan(AbstractFan fan) {
        fans.add(fan);
    }

    @Override
    void notifyFan(String msg) {
        fans.forEach(e -> {
            e.acceptMsg(msg);
        });
    }
}
