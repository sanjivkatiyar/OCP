package com.ocp.java.mock.test1;


public class Q33 {

    public static class TestInner {
        public void sayIt() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        //call here
    }
}

// An instance of the nested class can be created from any class using: new TestOuter.TestInner().
// (Assuming appropriate imports).

// TestInner is static but its method sayIt is not. So, you need to do new TestInner().sayIt();
// in main to invoke sayIt.

// An instance of the nested class can be created from a class of package mypack using: new TestInner().
// (Assuming appropriate imports).
//Any class can statically import TestClass.TestInner like this: import static mypack.TestOuter.TestInner;
// and then create an instance of TestInner like this: TestOuter.TestInner ti = new TestInner();