package com.gp20200307;

/**
 * 2020/3/7
 * author:ljh
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountCourse() {
        return super.getPrice() * 0.6;
    }
}
