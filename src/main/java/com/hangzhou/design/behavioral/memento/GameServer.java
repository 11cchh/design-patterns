package com.hangzhou.design.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Faye
 * @Date 2022/11/24 11:18
 */
public class GameServer {
    Map<Integer, GameRecord> records = new HashMap<>();
    int i = 1;

    /**
     * 添加游戏记录
     * @param gameRecord 记录
     */
    void add(GameRecord gameRecord){
        gameRecord.setId(i++);
        records.put(gameRecord.getId(), gameRecord);
    }

    /**
     * 获取游戏记录
     */
    Gamer getRecord(Integer id) {
        GameRecord gameRecord = records.get(id);
        // 获取到备忘录里面的内容以后还要逆转
        Gamer gamer = new Gamer(gameRecord.getHp(), gameRecord.getMp(), gameRecord.getLevel(), this);
        return  gamer;
    }
}
