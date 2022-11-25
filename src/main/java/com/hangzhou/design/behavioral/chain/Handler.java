package com.hangzhou.design.behavioral.chain;

import java.util.Objects;

/**
 * @Author Faye
 * @Date 2022/11/24 17:12
 */
public class Handler extends AbstractHandler {
    @Override
    public void process(String str) {
        System.out.println("handler " + str);
        if (Objects.nonNull(nextHandler)) {
            nextHandler.process(str);
        }
    }
}
