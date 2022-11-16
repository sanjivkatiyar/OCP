package com.ocp.java._06.concurrency;

public class C74FixDataRaceUsingSynchronized {
    public static int count = 0;

    static Object lock = new Object();

    public static void addToCounter(){
        synchronized (lock) {
            int c = count;
            System.out.println("Before. " + count + ". Thread id: " + Thread.currentThread().getId());
            count = c + 1;
            System.out.println("After. " + count + ". Thread id: " + Thread.currentThread().getId());
        }
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            new Thread(C74FixDataRaceUsingSynchronized::addToCounter).start();
        }
    }
}
