package com.ocp.java._06.concurrency;

public class C63ImplementingRunnable {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("run(): " + Thread.currentThread().getName());
    }
}

