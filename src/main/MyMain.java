package main;

import implementation.MyQueue;

import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        MyQueue<Integer> queue = new MyQueue<>(arr);
        queue.enqueue(10);
        queue.traverse();
        queue.dequeue();
        queue.dequeue();
        Random random = new Random();
        for (int i = 0; i < 5 ; i++) {
            System.out.println("size = " + queue.size());
            queue.enqueue(random.nextInt(100));
            queue.traverse();

        }
        System.out.println("size = " + queue.size());

    }
}
