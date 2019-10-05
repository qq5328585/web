package com.tj.ThreadTest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 2019/10/4
 * author:ljh
 */
public class ContainerSingleton {

    private static Map<String, Object> containerMap = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {

    }

    public static Object getInstance(String className) {
        if (className == null || "".equals(className)) {
            return null;
        }
        synchronized (containerMap) {
            if (!containerMap.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    containerMap.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return containerMap.get(className);
            }
        }
    }
}
