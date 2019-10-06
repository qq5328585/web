package com.tj.pattern.prototype.simpleClone;

import java.util.Date;
import java.util.List;

/**
 * 2019/10/5
 * author:ljh
 */
public class SimpleClone implements Prototype {
    private String name;
    private int age;
    private Date date;
    private List<String> hobbyList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    @Override
    public SimpleClone clone() {
        SimpleClone simpleClone = new SimpleClone();
        simpleClone.setAge(this.age);
        simpleClone.setName(this.name);
        simpleClone.setDate(this.date);
        simpleClone.setHobbyList(this.hobbyList);

        return simpleClone;
    }
}
