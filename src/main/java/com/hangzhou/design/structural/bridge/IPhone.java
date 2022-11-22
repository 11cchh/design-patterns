package com.hangzhou.design.structural.bridge;

import lombok.ToString;

/**
 * @Author Faye
 * @Date 2022/11/22 11:25
 */
@ToString
public class IPhone extends AbstractPhone {
    @Override
    String getPhone() {
        return "iphone：" + sale.getSale();
    }
}
