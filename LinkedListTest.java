package com.AbstractDataTypes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void size() {
        LinkedList list = new LinkedList();

        assertEquals(0, list.size());
        list.add(23);
        assertEquals(1, list.size());
    }

    @Test
    void add() {
        LinkedList list = new LinkedList();
        list.add(23);
        list.add(33);
        list.add(44);
        assertEquals(44, list.get(list.size()-1));
    }

    @Test
    void testAdd() {
        LinkedList list = new LinkedList();
        list.add(0,23);
        list.add(1, 33);
        list.add(2, 44);
        assertEquals(44, list.get(list.size()-1));
        list.add(1, 199);
        assertEquals(199, list.get(1));
    }

    @Test
    void get() {
        LinkedList list = new LinkedList();
        list.add(0,23);
        list.add(1, 33);
        list.add(2, 44);
        assertEquals(23, list.get(0));
        assertEquals(33, list.get(1));
        assertEquals(44, list.get(2));
        assertEquals(null, list.get(3));
    }

    @Test
    void remove() {
        LinkedList list = new LinkedList();
        list.add(0,23);
        list.add(1, 33);
        list.add(2, 44);
        assertEquals(3, list.size());
        list.remove(2);
        assertEquals(2, list.size());
    }

    @Test
    void contains() {
        LinkedList list = new LinkedList();
        list.add(0,23);
        list.add(1, 33);
        list.add(2, 44);
        assertTrue(list.contains(23));
        assertFalse(list.contains(100));

    }

    @Test
    void empty() {

        LinkedList list = new LinkedList();
        assertTrue(list.empty());
        list.add(0,23);
        list.add(1, 33);
        list.add(2, 44);
        assertFalse(list.empty());

    }
}