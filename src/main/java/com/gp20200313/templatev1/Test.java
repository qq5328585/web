package com.gp20200313.templatev1;

/**
 * 2020/3/13
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("======JAVA课程=======");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setCheckHomeworkFlag(true);
        javaCourse.createCourse();

        System.out.println("======PYTHON课程=======");
        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }
}
