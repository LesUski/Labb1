package com.AbstractDataTypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.get(stack.size()-1));
    }

    @Test
    void pop() {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.pop();
        assertEquals(20, stack.get(stack.size()-1));
        assertEquals(20, stack.pop());
    }

    @Test
    void peak() {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.peak());

    }
}