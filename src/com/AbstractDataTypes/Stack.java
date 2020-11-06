package com.AbstractDataTypes;

public class Stack extends LinkedList {

    public void push(Object value) {
        add(value);
    }

    public Object pop() {
        Object temp = get(size() - 1);
        remove(size() - 1);
        return temp;
    }

    public Object peek() {
        return get(size() - 1);
    }

}
