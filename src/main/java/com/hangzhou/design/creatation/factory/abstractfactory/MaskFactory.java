package com.hangzhou.design.creatation.factory.abstractfactory;

/**
 * 具体口罩工厂
 * @Author Faye
 * @Date 2022/11/21 11:46
 */
public class MaskFactory extends AbstractMaskFactory{
    @Override
    public AbstractMask createMask() {
        return new N95Mask();
    }
}
