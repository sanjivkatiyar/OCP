package ocp.java._02.oops.abstractkeyword;

public class Test {
}

abstract class A{
    public A(){
        System.out.println("A-A()");
    }
    public A(int a){
        System.out.println("A-A(int a)");
    }
}

class B extends A{
    public static void main(String[] args) {
        B b = new B();
        //A a = new A();     // A is abstract error
    }
}


abstract class Employee {
     abstract void calculateSalary();
}
class FullTimeEmployee extends Employee {

    protected void calculateSalary() { // DOES NOT COMPILE
        System.out.println("Salary is computed");

    }
}