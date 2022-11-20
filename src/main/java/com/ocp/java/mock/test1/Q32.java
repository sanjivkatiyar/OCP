package com.ocp.java.mock.test1;

import java.util.function.Supplier;

class Employee {
    int age;
}

public class Q32 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Supplier<Employee> se = () -> {
            e.age = 40;
            return e;
        }; //1
        // No problem here. A lambda expression can use a local variable if that variable is final or effectively final.
        // Here, e is not being changed anywhere in the code (it keeps pointing to the same Employee object throughout,
        // although the fields values do change) and is therefore effectively final.
        e.age = 50;//2
        System.out.println(se.get().age); //3
    }
}

// Observe that at line //2, e.age is being set to 50.
// However, at line //3, the lambda expression defined at line //1 is executed.
// It changes e.age to 40.  So, even though,
// visually, e.age=50 appears in the code after e.age=40, it is actually executed before e.age=40.