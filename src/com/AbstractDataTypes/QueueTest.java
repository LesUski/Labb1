package com.AbstractDataTypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue() {
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(332);
        assertEquals(12, q.peek());
    }

    @Test
    void dequeue() {
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(332);
        q.dequeue();
        assertEquals(332, q.peek());
    }

    @Test
    void peek() {
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(332);
        q.dequeue();
        assertEquals(332, q.peek());
    }
}