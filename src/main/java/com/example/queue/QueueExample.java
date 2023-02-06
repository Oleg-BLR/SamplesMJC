package com.example.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        queue.add("Aleh");
//        queue.add("Valery");
//        queue.add("Kristina");
//        queue.add("John");
//        queue.add("Ralph");

//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//        queue.add("4");
//        queue.add("5");

        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        System.out.println("---");
        System.out.println(queue.remove());
        System.out.println("---");
//        queue.remove();
        queue.remove();
        queue.remove();
//        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }

}
