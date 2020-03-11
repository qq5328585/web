package com.gp20200308.clear;

/**
 * 2020/3/8
 * author:ljh
 */
public abstract class CourseComponet {

    public void addChild(CourseComponet courseComponet) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void removeChild(CourseComponet courseComponet) {
        throw new UnsupportedOperationException("不支持移除操作");
    }

    public String getName(CourseComponet courseComponet) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CourseComponet courseComponet) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
