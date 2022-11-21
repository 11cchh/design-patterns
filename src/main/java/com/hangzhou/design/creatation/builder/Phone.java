package com.hangzhou.design.creatation.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Faye
 * @Date 2022/11/21 16:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    protected String cpu;
    protected String memory;
    protected String disk;
    protected String camera;
}
