package com.ocp.java.mock.test2;


public class Q10 {
    public class A {
    }

    public static class B {
    }

    public static void main(String args[]) {
        class C {
        }

        // static class D{}               // Method local class can not be static
        new Q10().new A();

        // new Q10().new B();

        new Q10.B();

        // new Q10.A();                  // A is not static. So on outer instance of TestClass is necessary.

        // new Q10.C();

        new C();

        //1
    }
}
/*
class A is not static inner class of TestClass. So it cannot exist without an outer instance of TestClass.
So, option 1 is the right way to instantiate it. class B is static inner class and can be instantiated like this:
new TestClass.B().
But new TestClass().new B() is not correct.
Although not related to this question, unlike popular belief, anonymous class can never be static.
Even if created in a static method.
 */