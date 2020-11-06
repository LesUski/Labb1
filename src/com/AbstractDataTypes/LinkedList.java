package com.AbstractDataTypes;

public class LinkedList {

    Node head;
    private int counter;

    public static class Node {
        Object data;
        Node next;

        public Node (Object value) {
            data = value;
            next = null;
        }

        public Object get() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }

    public int size() {
        return counter;
    }

    public void add(Object value) {
        if (head == null) {
            head = new Node(value);
        }

        Node temp = new Node(value);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(temp);

        counter++;
    }

    public void add(int index, Object data) {
        Node temp = new Node(data);
        Node current;
        if (head == null) {
            head = new Node(data);
        }
        current = head;
        for (int i = 0; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());

        current.setNext(temp);

        counter++;
    }

    public Object get(int index) {
        if (index < 0) {
            return null;
        }
        Node current;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) return null;

                current = current.getNext();
            }
            return current.get();
        }
        return null;
    }

    public void remove(int index) {
        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() != null) current = current.getNext();
            }
            assert current.getNext() != null;
            current.setNext(current.getNext().getNext());
            counter--;
        }
    }

    public boolean contains(Object value) {
        Node current = head;

        while (current != null) {
            if (current.get().equals(value)) return true;
            current = current.getNext();
        }
        return false;
    }

    public boolean empty() {
        return head == null;
    }
}
