package com.ocp.java._06.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class C66ExecutorService {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        int cpuCount = Runtime.getRuntime().availableProcessors();
        System.out.println(cpuCount);
        ExecutorService es2 = Executors.newFixedThreadPool(cpuCount);

        ExecutorService es3 = Executors.newSingleThreadExecutor();
    }
}
