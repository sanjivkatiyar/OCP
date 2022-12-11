package ocp.java.mock.test2;

import java.util.Arrays;
import java.util.List;

public class Q28 {
}

class MyProcessor {
    Integer value;

    public MyProcessor(Integer value) {
        this.value = value;
    }

    public void process() {
        System.out.println(value + " ");
    }
}

class TestClass {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);
        /*

ls.stream().map(x->MyProcessor::new(x)) .forEach(MyProcessor::process);
You cannot pass arguments to a constructor or method while referring to method/constructor reference. If the
constructor or the method requires an argument, it is passed when the constructor or the method is actually invoked.
For example, you can do this: names.stream() .map(x->{  //referring to MyProcessor's constructor that takes one
Integer argument. Function<Integer, MyProcessor> f = MyProcessor::new;  return f.apply(x); //passing the actual
 Integer argument. }) .forEach(MyProcessor::process);
         */

        ls.stream().map(MyProcessor::new).forEach(MyProcessor::process);
        // Here, map method does have an implicit Integer object in the context, which is in fact the current element
        // of the list. This element will be passed as an argument to the MyProcessor constructor. Similarly, forEach
        // has a MyProcessor object in the context while invoking the process method. Since process is an instance
        // method of MyProcessor, the MyProcessor instance that is available in the context will be used to invoke
        // the process method.
    }
}
