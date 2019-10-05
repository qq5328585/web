package com.tj.ThreadTest;

import java.util.Date;

/**
 * 2019/10/4
 * author:ljh
 */
public enum EnumSingleton {
    ENUM_SINGLETON;

    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public static EnumSingleton getInstance() {
        return ENUM_SINGLETON;
    }
}
