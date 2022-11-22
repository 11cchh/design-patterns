package com.hangzhou.design.structural.bridge;

import lombok.AllArgsConstructor;

/**
 * 抽象销售渠道
 * @Author Faye
 * @Date 2022/11/22 11:19
 */
@AllArgsConstructor
public abstract class AbstractSale {
    private String type;
    private Integer price;

    public String getSale() {
        return "渠道：" + type + "，价格：" + price;
    }
}
