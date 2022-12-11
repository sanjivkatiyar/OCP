package ocp.java._02.oops.objectinitialisation;


// static block/variable (in order) -> instance block -> instance variable -> constructor
public class C29ObjectInitialization {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
    }
}

class A {
    static { System.out.println("static A1"); }           // 1a. static block
    { System.out.println("instance A1");}                 // 2a. instance block
    public A(){}                                          // 3. constructors
    public A(int i){ System.out.println(i+"\n"); }
    { System.out.println("instance A2"); }                // 2b. instance block
}

class B{
    static { System.out.println("static B"); }           // 1a. static block
    static A s1 = new A(1);                           // 1b. static variable
    A a = new A(2);                                   // 2a. instance variable
    static A s2 = new A(4);                           // 1c. static variable
    { System.out.println("instance B"); }
    static { System.out.println("static B1"); }         // 1d. static block
    { System.out.println("instance B1"); }
}
