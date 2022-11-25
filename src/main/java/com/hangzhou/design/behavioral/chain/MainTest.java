package com.hangzhou.design.behavioral.chain;

/**
 * @Author Faye
 * @Date 2022/11/24 17:14
 */
public class MainTest {
    public static void main(String[] args) {
        Handler handler1 = new Handler();
        Handler handler2 = new Handler();
        handler1.setNext(handler2);

        handler1.process("things");
    }
}
