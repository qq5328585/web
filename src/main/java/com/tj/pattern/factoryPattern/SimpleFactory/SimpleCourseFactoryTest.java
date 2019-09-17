package com.tj.pattern.factoryPattern.SimpleFactory;

import com.tj.pattern.factoryPattern.ICourse;

/**
 * 2019/9/13
 * author:ljh
 */
public class SimpleCourseFactoryTest {
    public static void main(String[] args) {
        SimpleCourseFactory sml = new SimpleCourseFactory();
//        ICourse couese = sml.getCourse(JavaCourse.class);
//        couese.read();
//        ICourse couese1 = sml.getCourse(PythonCourse.class);
//        couese1.read();
        ICourse course = sml.getCourse("java");
        course.read();
        ICourse course1 = sml.getCourse("python");
        course1.read();
        ICourse course2 = sml.getCourse("asdasd");
        course2.read();
    }

}
