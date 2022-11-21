package com.hangzhou.design.creatation.builder;

/**
 * @Author Faye
 * @Date 2022/11/21 16:05
 */
public class MainTest {
    public static void main(String[] args) {
        IPhoneBuilder iPhoneBuilder = new IPhoneBuilder();
        iPhoneBuilder.customCpu("A16");
        iPhoneBuilder.customMemory("16G");
        iPhoneBuilder.customDisk("128G");
        iPhoneBuilder.customCamera("渣渣像素");
        Phone phone = iPhoneBuilder.getPhone();
        System.out.println(phone);
    }
}
