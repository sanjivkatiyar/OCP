package com.ocp.java.mock.test1;

import java.util.concurrent.Future;

public class Q38 {

    public String call() throws Exception {
        //do something
        return "Data from callable";
    }

}

/*

Return type of the method call() cannot be void because Callable interface declares this method as :
public interface Callable<V>{
  V call() throws Exception;
}
Note that if you put Future as the return type of the call method, it would be technically a valid implementation.
But it would not be appropriate. A Callable should return actual data object instead of wrapping the data into a Future.
It is the job of ExecutorService.submit() method to return a Future that wraps the data returned by Callable.call().
For example: Future result = Executors.newSingleThreadExecutor().submit(new MyTask());
Further, since Future is an interface, new Future ("Data from callable") will not compile either.
 */