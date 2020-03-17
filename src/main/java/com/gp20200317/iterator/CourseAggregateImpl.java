package com.gp20200317.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 2020/3/17
 * author:ljh
 */
public class CourseAggregateImpl implements ICourseAggregate {
    private List list;

    public CourseAggregateImpl() {
        this.list = new ArrayList();
    }

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new IteratorImpl<Student>(list);
    }
}
