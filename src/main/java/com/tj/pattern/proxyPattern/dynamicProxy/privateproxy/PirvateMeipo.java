package com.tj.pattern.proxyPattern.dynamicProxy.privateproxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2019/10/28
 * author:ljh
 */
public class PirvateMeipo implements PrivateInvocationHandler{
    private Object target;

    private Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = this.target.getClass();
        return PrivateProxy.newProxyInstance(new PrivateClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Proxy proxy, Method method, Object[] objects) throws Throwable {
        before();
        Object obj = method.invoke(this.target, objects);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆,收到你的要求,开始帮你物色");
    }

    private void after() {
        System.out.println("我已经找到符合你要求的女生,可以相亲了");
    }
}
