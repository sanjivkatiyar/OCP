package com.ocp.java._06.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class C69ExecutorServiceSubmitTaskCollection {

    //private static ExecutorService es = Executors.newSingleThreadExecutor();
    private static ExecutorService es = Executors.newFixedThreadPool(4);

    private static List<Callable<String>> callables = new ArrayList<>();

    public static void main(String[] args) {

        callables.add(()->"A");
        callables.add(()->"B");
        callables.add(()->"C");
        callables.add(()->"D");

        //invokeAny();
        invokeAll();
    }

    public static void invokeAny(){
        try {
            String result = es.invokeAny(callables);
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            es.shutdown();
        }
        System.out.println("Always at the end!");
    }

    public static void invokeAll(){

        try {
            List<Future<String>> list = es.invokeAll(callables);
            list.forEach(future->{
                try {
                    System.out.println(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            es.shutdown();
        }
        System.out.println("Always at the end!");
    }
}
