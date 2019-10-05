package com.tj.pattern.singletonPattern.containerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 2019/10/3
 * author:ljh
 */
public class ContainerSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {}

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if(!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
