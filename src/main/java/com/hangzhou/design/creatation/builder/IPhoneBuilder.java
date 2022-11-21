package com.hangzhou.design.creatation.builder;

/**
 * 具体构建者
 *
 * @Author Faye
 * @Date 2022/11/21 16:03
 */
public class IPhoneBuilder extends AbstractBuilder {
    public IPhoneBuilder() {
        this.phone = new Phone();
    }

    @Override
    void customCpu(String cpu) {
        phone.cpu = cpu;
    }

    @Override
    void customMemory(String memory) {
        phone.memory = memory;
    }

    @Override
    void customDisk(String disk) {
        phone.disk = disk;
    }

    @Override
    void customCamera(String camera) {
        phone.camera = camera;
    }
}
