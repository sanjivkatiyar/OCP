package com.ocp.java.mock.test2;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class Q38 {
}

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(50000);
        return "DONE";
    }
}

class TestClass2 {
    public static void main(String[] args) throws Exception {
        var es = Executors.newSingleThreadExecutor();
        var future = es.submit(new MyCallable());
        System.out.println(future.get()); //1                       // DONE
        es.shutdownNow(); //2
    }
}

/*
Remember that Future's get() will block until there is a value to return or there is an exception. Therefore, the
program will block at line marked //1 and will print the return value of the given Callable i.e. "DONE" once it is
done.  If you don't want to block the code, you may use Future's isDone(), which returns a boolean without blocking.
 List<Runnable> shutdownNow() This method attempts to stop all actively executing tasks, halts the processing of
 waiting tasks, and returns a list of the tasks that were awaiting execution. This method does not wait for actively
 executing tasks to terminate. Use awaitTermination to do that.  There are no guarantees beyond best-effort attempts
 to stop processing actively executing tasks. For example, typical implementations will cancel via Thread's interrupt
 () method, so any task that fails to respond to interrupts may never terminate.
 */