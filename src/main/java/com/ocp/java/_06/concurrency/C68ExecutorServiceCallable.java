package com.ocp.java._06.concurrency;

import java.util.concurrent.*;

public class C68ExecutorServiceCallable {

    public static void main(String[] args) {

        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Integer> future = es.submit(() -> 3+5 );

        try {
            System.out.println("The answer is: " + future.get(500, TimeUnit.MILLISECONDS));
        } catch (ExecutionException | TimeoutException | InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();
    }
}
