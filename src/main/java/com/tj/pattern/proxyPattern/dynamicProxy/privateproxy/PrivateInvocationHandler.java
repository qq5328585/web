package com.tj.pattern.proxyPattern.dynamicProxy.privateproxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 2019/10/28
 * author:ljh
 */
public interface PrivateInvocationHandler {
    public Object invoke(Proxy proxy, Method method, Object[] objects) throws Throwable;
}
