package com.gp20200317.iterator;

import java.util.List;

/**
 * 2020/3/17
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan");
        Student student2 = new Student("lisi");
        Student student3 = new Student("wangwu");

        ICourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.add(student1);
        courseAggregate.add(student2);
        courseAggregate.add(student3);

        Iterator iterator = courseAggregate.iterator();

        System.out.println("===测试添加===");

        while(iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.getName());
        }

        System.out.println("==测试删除==");

        courseAggregate.remove(student1);

        iterator = courseAggregate.iterator();

        while(iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.getName());
        }

    }
}
