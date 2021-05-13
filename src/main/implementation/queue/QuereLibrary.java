package main.implementation.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QuereLibrary {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
        Deque<Integer> deque = new LinkedList<>();
    }

}
