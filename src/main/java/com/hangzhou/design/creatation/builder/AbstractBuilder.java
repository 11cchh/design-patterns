package com.hangzhou.design.creatation.builder;

/**
 * 抽象构建者
 * @Author Faye
 * @Date 2022/11/21 16:01
 */
public abstract class AbstractBuilder {
    /**
     * 属性
     */
    public Phone phone;

    /**
     * 自定义构造
     * @param cpu cpu
     */
    abstract void customCpu(String cpu);

    /**
     * 自定义构造
     * @param memory memory
     */
    abstract void customMemory(String memory);

    /**
     * 自定义构造
     * @param disk disk
     */
    abstract void customDisk(String disk);

    /**
     * 自定义构造
     * @param camera camera
     */
    abstract void customCamera(String camera);

    /**
     * 获取自定义构造产品
     * @return 产品
     */
    public Phone getPhone() {
        return phone;
    }
}
