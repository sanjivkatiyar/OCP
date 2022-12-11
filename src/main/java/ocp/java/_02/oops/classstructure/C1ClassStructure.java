package ocp.java._02.oops.classstructure;

public class C1ClassStructure {
    // class and instance variables go here
    static int count; // class variable | all the instances of class will share one copy of class variable
    int x; // instance variable | every instance of class will get it's own copy of instance variable
    static {} // static block | will be executed once when the class is loaded very first time
    {} // instance block | will be executed prior to every invocation of constructor

    C1ClassStructure(){} // constructor | does not have return type and same name as class

    public static void main(String[] args) {
        // every program starts here
    }

    public static void m1() { // static method | Static methods can call static variables only
    }

    public void m2 () { // instance method
    }
}
