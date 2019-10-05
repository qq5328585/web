package com.tj.pattern.singletonPattern.enumSingleton;

/**
 * 2019/9/28
 * author:ljh
 */
public enum EnumSingleton {
    INSTACE;

    private Object date;

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public static EnumSingleton getInstance() {
        return INSTACE;
    }
}
