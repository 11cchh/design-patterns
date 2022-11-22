package com.hangzhou.design.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用 cglib 创建出代理对象
 *
 * @Author Faye
 * @Date 2022/11/22 17:04
 */
public class CglibProxy {
    public static <T> T createProxy(T t) {
        // 创建增强器
        Enhancer enhancer = new Enhancer();

        // 射鹅之要增加哪个类的功能，增强器动态为这个类创建一个子类
        enhancer.setSuperclass(t.getClass());

        // 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                // 编写拦截的逻辑
                System.out.println("cglib 起作用啦～");
                // 目标方法进行执行
                Object invoke = methodProxy.invokeSuper(o, args);
                return invoke;
            }
        });
        Object o = enhancer.create();
        return (T) o;
    }
}
