package com.tj.pattern.prototypePattern.deepClone;

import java.util.Date;

/**
 * 2019/10/5
 * author:ljh
 */
public class Monkey {

    private int height;
    private int weight;
    private Date birthday;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}