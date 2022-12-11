package ocp.java.mock.test1;

interface I{
}

class A implements I{
}

class B extends A {
}

class C extends B{
}

public class Q16 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        a = (B)(I)b;        // okay

        b = (B)(I) a;       // runtime failure A is not B

        // a = (I) b;       // compilation failure - assigning super type (I) to subtype (A)

        I i = (C) a;        // Run time failure - A is not C
    }
}