package com.hangzhou.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理
 * @Author Faye
 * @Date 2022/11/22 15:55
 */
public class JDKTikTokProxy<T> implements InvocationHandler {
    private T target;

    /**
     * 构造器，接收被代理对象
     * @param target
     */
    public JDKTikTokProxy(T target) {
        this.target = target;
    }

    /**
     * 获取被代理对象的代理对象
     * @param t 被代理对象
     * @return 代理对象
     * @param <T>
     */
    public static<T> T getProxy(T t) {
        /**
         * ClassLoader loader：当前被代理对象的类加载器
         * Class<?>[] interfaces：当前被代理对象所实现的所有接口
         * InvocationHandler h：当前被代理对象执行目标方法时拦截增强方法
         */
        Object o = Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new JDKTikTokProxy(t));
        return (T) o;
    }

    /**
     *
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 真正被执行的方法（反射执行）
        System.out.println("真正执行被代理对象的方法...");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
