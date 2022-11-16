package com.ocp.java._06.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C75FixDataRaceWithLock {
    public static int count = 0;

    //static Object lock = new Object();

    private static Lock lock = new ReentrantLock();

    public static void addToCounter(){
        if (lock.tryLock()) {
            //lock.lock();
            try {
                int c = count;
                System.out.println("Before. " + count + ". Thread id: " + Thread.currentThread().getId());
                count = c + 1;
                System.out.println("After. " + count + ". Thread id: " + Thread.currentThread().getId());
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Could not obtain lock!");
        }
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            new Thread(C75FixDataRaceWithLock::addToCounter).start();
        }
    }
}
