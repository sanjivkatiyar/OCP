package com.ocp.java._06.concurrency;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class C80BlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // regular methods
        queue.offer("Red");
        queue.offer("Green");
        queue.offer("Blue");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);

        // special blocking methods
        try{
            queue.offer("White", 100, TimeUnit.MILLISECONDS);
            queue.poll(200, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(queue);
    }
}
