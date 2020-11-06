package com.AbstractDataTypes;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(12);
        list.add(13);
        System.out.println("Actual list size: " + list.size());
        list.add(1,99);
        System.out.println("================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index nr " + i + " : " +  list.get(i));
        }
        list.add(55);
        System.out.println("================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index nr " + i + " : " +  list.get(i));
        }
        list.remove(2);
        System.out.println("================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index nr " + i + " : " +  list.get(i));
        }

        System.out.println("List is empty: " + list.empty());

        System.out.println("list contains 0: " + list.contains(0));
        System.out.println("list contains 99: " + list.contains(99));

        System.out.println("\nStack solution :\n" +
                "=======================================================");
        Stack stack = new Stack();
        stack.push(23);
        stack.push(32);
        stack.push(10);
        stack.push(20);
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("Index nr: " + i + " : " + stack.get(i));
        }
        System.out.println("================");
        stack.pop();
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("Index nr: " + i + " : " + stack.get(i));
        }

        System.out.println("\nQueue solution :\n" +
                "=======================================================");
        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(22);
        q.enqueue(33);
        for (int i = 0; i < q.size(); i++) {
            System.out.println("index nr : " + i + " : " +q.get(i));
        }

        System.out.println("================");
        System.out.println(q.dequeue());
        for (int i = 0; i < q.size(); i++) {
            System.out.println("index nr : " + i + " : " +q.get(i));
        }
        System.out.println(q.peek());

    }
}
