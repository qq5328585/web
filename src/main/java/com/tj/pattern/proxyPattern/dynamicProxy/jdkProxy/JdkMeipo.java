package com.tj.pattern.proxyPattern.dynamicProxy.jdkProxy;

import com.tj.pattern.proxyPattern.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2019/10/27
 * author:ljh
 */
public class JdkMeipo implements InvocationHandler {
    private Object target;

    public Object getInstance(Object person) {
        this.target = person;
        Class<?> clazz = this.target.getClass();
        Class<?>[] c = clazz.getInterfaces();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆,开始物色对象");
    }

    private void after() {
        System.out.println("已经找到,准备结婚吧");
    }
}
