package main.implementation.linkedlist;

import java.util.LinkedList;

public class LinkedListLibrary {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addFirst(0);
        linkedList.addLast(3);
        linkedList.add(2,5);
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
