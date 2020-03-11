package com.gp20200308.clear;

/**
 * 2020/3/8
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        CourseComponet learnCourse = new CoursePackage("学习课程", 1);

        CourseComponet javaCourse = new Course("java课程", 1000);
        CourseComponet pythonCourse = new Course("python课程", 500);

        CourseComponet workCourse = new CoursePackage("工作提升课程", 2);
        CourseComponet excelCourse = new Course("excel课程", 700);
        CourseComponet psCourse = new Course("ps课程", 1500);

        workCourse.addChild(excelCourse);
        workCourse.addChild(psCourse);

        learnCourse.addChild(javaCourse);
        learnCourse.addChild(pythonCourse);
        learnCourse.addChild(workCourse);

        learnCourse.print();
    }
}
