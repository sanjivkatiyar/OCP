package ocp.java._06.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class C72AtomicInteger {

    private static final AtomicInteger atomicCount = new AtomicInteger(0);

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i=1; i<10; i++){
            es.submit(() -> System.out.println(atomicCount.incrementAndGet() + " "));
        }
        es.shutdown();
    }
}
