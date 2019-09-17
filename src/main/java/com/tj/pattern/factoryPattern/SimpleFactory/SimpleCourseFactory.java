package com.tj.pattern.factoryPattern.SimpleFactory;

import com.tj.pattern.factoryPattern.ICourse;
import com.tj.pattern.factoryPattern.JavaCourse;
import com.tj.pattern.factoryPattern.PythonCourse;

/**
 * 2019/9/13
 * author:ljh
 */
public class SimpleCourseFactory {
    /*public ICourse getCourse(Class clazz) {
        if(clazz != null) {
            try {
                ICourse course = (ICourse) clazz.newInstance();
                return course;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }*/
//    private JavaCourse a;
//    private ICourse b;

    public ICourse getCourse(String name) {
        if(name != null) {
            ICourse course;
            switch (name) {
                case "java" :
                    course = new JavaCourse();
                    break;
                case "python" :
                    course = new PythonCourse();
                    break;
                default:
                    course = new PythonCourse();
                    break;
            }
            return course;
        }

        return null;
    }

}
