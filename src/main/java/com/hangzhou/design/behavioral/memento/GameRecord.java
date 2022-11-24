package com.hangzhou.design.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Faye
 * @Date 2022/11/24 11:18
 */
@Data
@AllArgsConstructor
public class GameRecord {
    private Integer id;
    private Integer hp;
    private Integer mp;
    private Integer level;
    private GameServer gameServer;

    public GameRecord(Integer hp, Integer mp, Integer level, GameServer gameServer) {
        this.hp = hp;
        this.mp = mp;
        this.level = level;
        this.gameServer = gameServer;
    }
}
