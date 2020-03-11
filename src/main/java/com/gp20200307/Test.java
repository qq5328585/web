package com.gp20200307;

/**
 * 2020/3/7
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
//        ICourse iCourse = new JavaDiscountCourse(1, "java架构", 1000D);
//        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCourse;
        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(1, "java架构", 1000D);
        System.out.println("课程ID: " + javaDiscountCourse.getId() +
                "\n课程标题: " + javaDiscountCourse.getName() +
                "\n课程价格: " + javaDiscountCourse.getPrice() +
                "\n打折价格: " + javaDiscountCourse.getDiscountCourse());
    }
}
