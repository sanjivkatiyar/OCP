package ocp._11.Polymorphism.Overriding;

class Super{

    public int doSomething(){return 1;}
}

class Sub extends Super{
    public int doSomething(){return 1;}
    //public void doSomething(){}              // compilation error - incompatible return type
    // public long doSomething(){return 1;}    // compilation error - incompatible return type


}

public class Test {

    public static void main(String[] args) {
    }
}

/*
Method Overriding

Method overriding is way to achieve dynamic polymorphism
It lets you redefine a method in a child class which is already define in the parent class.
The method definition in the child class overrides the definition in the parent class by having the same method signature
The version of the method that is executed will determine by the object that is used to invoke it at run time(Dynamic  binding).
The overridden method cannot have lesser or weaker access privilege in the child class
Private methods cannot be overridden
 */