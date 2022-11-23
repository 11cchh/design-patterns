package com.hangzhou.design.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Author Faye
 * @Date 2022/11/23 15:12
 */
@Data
@ToString
@AllArgsConstructor
public class Waitress extends AbstractWaitressFlyweight  {
    /**
     * 工号
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    @Override
    void service() {
        System.out.println("工号：" + id + "，名称：" + name + "，年龄：" + age + "，正在为您服务");
        this.serviceState = false;
    }

    @Override
    void end() {
        System.out.println("工号：" + id + "，名称：" + name + "，年龄：" + age + "，服务结束");
        this.serviceState = true;
    }
}
