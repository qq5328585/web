package com.tj.pattern.factoryPattern.FactoryMethod;

import com.tj.pattern.factoryPattern.FactoryMethod.impl.FactoryJavaCourseMethod;
import com.tj.pattern.factoryPattern.FactoryMethod.impl.FactoryPythonCourseMethod;
import com.tj.pattern.factoryPattern.ICourse;

/**
 * 2019/9/13
 * author:ljh
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactoryCourseMethod courseMethod = new FactoryJavaCourseMethod();
        ICourse javaCourse = courseMethod.getCourse();
        javaCourse.read();
        IFactoryCourseMethod courseMethod1 = new FactoryPythonCourseMethod();
        ICourse pythonCourse = courseMethod1.getCourse();
        pythonCourse.read();
    }
}
