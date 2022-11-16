package com.ocp.java._06.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C67ExecutorServiceRunnable {

    public static void main(String[] args) {

        ExecutorService ex = Executors.newSingleThreadExecutor();
        ex.submit(()->{
            System.out.println("Runnable Lambda Example");
        });

        ex.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Example");
            }
        });

        // shut down executor service otherwise application will never terminate
        ex.shutdown();
    }
}
