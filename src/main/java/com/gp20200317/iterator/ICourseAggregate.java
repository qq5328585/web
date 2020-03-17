package com.gp20200317.iterator;

/**
 * 2020/3/17
 * author:ljh
 */
public interface ICourseAggregate{
    void add(Student student);
    void remove(Student student);
    Iterator<Student> iterator();
}
