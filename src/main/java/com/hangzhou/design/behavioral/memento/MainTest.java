package com.hangzhou.design.behavioral.memento;

/**
 * 备忘录模式
 *
 * @Author Faye
 * @Date 2022/11/24 14:01
 */
public class MainTest {
    public static void main(String[] args) {
        GameServer gameServer = new GameServer();
        Gamer gamer = new Gamer(0, 0, 0, gameServer);
        gamer.playGame();
        gamer.saveGameRecord();
        Gamer fromMemento = gamer.getFromMemento(1);
        System.out.println("fromMemento:" + fromMemento);
        gamer.playGame();
        System.out.println("fromMemento:" + fromMemento);
    }
}
