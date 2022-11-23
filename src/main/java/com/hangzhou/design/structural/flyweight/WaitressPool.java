package com.hangzhou.design.structural.flyweight;

import java.util.*;

/**
 * @Author Faye
 * @Date 2022/11/23 15:16
 */
public class WaitressPool {
    private static Map<Integer, AbstractWaitressFlyweight> pool = new HashMap<>();

    /**
     * 享元
     */
    static {
        Waitress waitress1 = new Waitress(1, "张", 18);
        Waitress waitress2 = new Waitress(2, "李", 20);
        pool.put(waitress1.getId(), waitress1);
        pool.put(waitress2.getId(), waitress2);
    }

    public static void addWaitress(AbstractWaitressFlyweight waitress) {
        pool.put(new Random().nextInt(100), waitress);
    }

    public static AbstractWaitressFlyweight getWaitress(Integer id) {
        AbstractWaitressFlyweight waitress = pool.get(id);
        if (Objects.isNull(waitress)) {
            for (AbstractWaitressFlyweight value : pool.values()) {
                if (value.getServiceState()) {
                    return value;
                }
            }
            return null;
        }
        return waitress;
    }
}
