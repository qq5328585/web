package com.gp20200317.iterator;

import java.util.List;

/**
 * 2020/3/17
 * author:ljh
 */
public class IteratorImpl<E> implements Iterator<E> {
    private List<E> list;
    private int currentPlace;
    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.print("当前位置:" + currentPlace + ": ");
        element = list.get(currentPlace);
        currentPlace++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if(currentPlace > list.size() - 1) {
            return false;
        }
        return true;
    }
}
