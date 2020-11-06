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

        public Node (int value, Node nextValue) {
            next = nextValue;
            data = value;
        }

        public Object get() {
            return data;
        }

        public void setData(Object value) {
            data = value;
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

        if (current != null) {

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(temp);
        }

        counter++;
    }

    public void add(int index, Object data) {
        Node temp = new Node(data);
        Node current;
        if (head == null) {
            head = new Node(data);
        }
        current = head;

        if (current != null) {

            for (int i = 0; i< index && current.getNext() != null; i++) {
                current = current.getNext();
            }
        }
        temp.setNext(current.getNext());

        current.setNext(temp);

        counter++;
    }

    public Object get(int index) {
        if (index < 0) {
            return null;
        }
        Node currrent = null;
        if (head != null) {
            currrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (currrent.getNext() == null) return null;

                currrent = currrent.getNext();
            }
            return currrent.get();
        }
        return currrent;
    }

    public void remove(int index) {

        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() != null) current = current.getNext();
            }
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
        if (head == null) {
            return true;
        } else return false;
    }
}
