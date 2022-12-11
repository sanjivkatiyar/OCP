package ocp.java.mock.test1;

import java.util.Arrays;
import java.util.List;

public class Q7 {

    public static void main(String[] args) {
        List<Character> ratings = Arrays.asList('U', 'R', 'A');
        ratings.stream()
                .filter(x->x=='A')  //1
                .peek(x->System.out.println("Old Rating "+x)) //2
                .map(x->x=='A'?'R':x) //3
                .peek(x->System.out.println("New Rating "+x)); //4
    }

}
// code will not print anything

/*
To answer this question, you need to know two things - distinction between "intermediate" and "terminal" operations
and which operations of Stream are "intermediate" operations.

A Stream supports several operations and these operations are divided into intermediate and terminal operations.
 The distinction between an intermediate operation and a termination operation is that an intermediate operation
 is lazy while a terminal operation is not. When you invoke an intermediate operation on a stream,
 the operation is not executed immediately.
 It is executed only when a terminal operation is invoked on that stream.
 In a way, an intermediate operation is memorized and is recalled as soon as a terminal operation is invoked.
 You can chain multiple intermediate operations and none of them will do anything until you invoke a terminal operation,
 at which time, all of the intermediate operations that you invoked earlier will be invoked along with the terminal operation.


It is easy to identify which operations are intermediate and which are terminal.
All intermediate operations return Stream (that means, they can be chained), while terminal operations don't.

In the given questions, filter, peek, and map are intermediate operations.
Since the code does not invoke any terminal operation on the stream,
the calls to these intermediate method do nothing. Therefore, no output is produced by the given code.
Adding a forEach instead of peek at the end will work because forEach is a terminal operation.
 */