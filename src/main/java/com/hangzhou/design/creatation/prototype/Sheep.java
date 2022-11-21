package com.hangzhou.design.creatation.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Author Faye
 * @Date 2022/11/21 09:45
 */
@Data
@ToString
@AllArgsConstructor
public class Sheep implements Cloneable{
    private String name;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
