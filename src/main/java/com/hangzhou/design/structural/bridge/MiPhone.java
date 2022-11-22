package com.hangzhou.design.structural.bridge;

import lombok.ToString;

/**
 * @Author Faye
 * @Date 2022/11/22 11:26
 */
@ToString
public class MiPhone extends AbstractPhone {
    @Override
    String getPhone() {
        return "xiaomi：" + sale.getSale();
    }
}
