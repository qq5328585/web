package com.gp20200308.clear;

/**
 * 2020/3/8
 * author:ljh
 */
public class Course extends CourseComponet {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponet courseComponet) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponet courseComponet) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name + ":价格是 " + price);
    }
}
