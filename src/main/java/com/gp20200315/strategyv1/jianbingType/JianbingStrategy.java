package com.gp20200315.strategyv1.jianbingType;

import java.util.HashMap;
import java.util.Map;

/**
 * 2020/3/15
 * author:ljh
 */
public class JianbingStrategy {
    public static final String baseJianbing = "BASE_JIANBING";
    public static final String eggJianbing = "EGG_JIANBING";
    public static final String defaultianbing = baseJianbing;

    private static Map<String, AbstractJianbing> jianbingMap = new HashMap<String, AbstractJianbing>();

    static {
        jianbingMap.put(baseJianbing, new BaseJianbing());
        jianbingMap.put(eggJianbing, new EggJianbing());
    }

    public static AbstractJianbing getJianbing(String key) {
        if(!jianbingMap.containsKey(key)) {
            return jianbingMap.get(defaultianbing);
        }
        return jianbingMap.get(key);
    }
}
