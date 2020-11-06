package com.AbstractDataTypes;

public class Queue extends LinkedList{

    public void enqueue (Object ob) {
        add(ob);
    }

    public Object dequeue() {
        Object temp = get(0);
        remove(0);
        return temp;
    }

    public Object peek () {
        return get(0);
    }
}
