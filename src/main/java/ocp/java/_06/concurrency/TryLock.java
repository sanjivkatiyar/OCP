package ocp.java._06.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class TryLock {

    public static void main(String[] args) {
        var rlock = new ReentrantLock();
        //var f1 = rlock.lock();               // lock returns void
        var f1 = rlock.tryLock();      // true
        System.out.println(f1);                // tryLock return boolean
        //var f2 = rlock.lock();
        var f2 = rlock.tryLock();      // true
        // If the current thread already holds this lock then the hold count
        // is incremented by one and the method returns true.
        System.out.println(f2);
    }
}
