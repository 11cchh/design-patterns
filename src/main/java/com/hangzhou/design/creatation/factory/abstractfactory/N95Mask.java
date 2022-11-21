package com.hangzhou.design.creatation.factory.abstractfactory;

/**
 * @Author Faye
 * @Date 2022/11/21 11:34
 */
public class N95Mask extends AbstractMask {
    public N95Mask() {
        this.price = 10;
    }

    @Override
    public void protect() {
        System.out.println("！N95口罩保护！");
    }
}
