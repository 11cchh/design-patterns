package com.hangzhou.design.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Random;

/**
 * @Author Faye
 * @Date 2022/11/24 11:17
 */
@Data
@ToString
@AllArgsConstructor
public class Gamer {
    private Integer hp;
    private Integer mp;
    private Integer level;
    private GameServer gameServer;

    /**
     * 保存游戏记录
     */
    void saveGameRecord() {
        System.out.println("正在保存当前记录....");
        GameRecord gameRecord = new GameRecord(hp, mp, level, gameServer);
        // 当前游戏信息保存到备忘录
        gameServer.add(gameRecord);
    }

    /**
     * 从备忘录获取游戏历史存档
     * @param id
     * @return
     */
    Gamer getFromMemento(Integer id) {
        System.out.println("获取历史存档信息...");
        Gamer record = gameServer.getRecord(id);
        return record;
    }

    /**
     * 玩游戏
     */
    void playGame(){
        int i = new Random().nextInt(100);
        hp = i;
        mp = i;
        level = i;
        System.out.println("......(〃'▽'〃)......" + this.toString());
    }
}
