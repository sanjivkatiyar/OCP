package com.ocp._11.Polymorphism.Overloading;

public class Test {

    public static void main(String[] args) {

    }

    public void doSomething(){

    }

    public void doSomething(int a){

    }

    private void doSomething(String s){

    }

    public int doSomething(long l){
        return 1;
    }

}

class Loan{
    private float interest;

    Loan(){
        interest = 8.5f;
    }

    //calculateEMI overloaded methods
    public double calculateEMI(int tenure, double principal){
        double simpleInterest = (principal * interest * tenure) / 100;
        return (simpleInterest+principal)/tenure;
    }
    public double calculateEMI(double principal, int tenure){
        double simpleInterest = (principal * interest * tenure) / 100;
        return (simpleInterest+principal)/tenure;
    }
    public double calculateEMI(int tenure, double principal, float interest){
        double simpleInterest = (principal * interest * tenure) / 100;
        return (simpleInterest+principal)/tenure;
    }

    public static void main(String[] args){
        Loan loan = new Loan();
        double result = loan.calculateEMI(20000d, 5); //d means double
        double value = loan.calculateEMI(5, 20000d);
        double val = loan.calculateEMI(5, 20000, 9.5f); // f means float
        // loan.calculateEMI(1,1);                        // ambiguous method call

        System.out.println("EMI per year is..." + result);
        System.out.println("EMI per year is..." + value);
        System.out.println("EMI per year is..." + val);

    }
}

class OverloadingTest {

    public void display(String ref){
        System.out.println("String..."+ref);
    }

    public void display(Object ref){
        System.out.println("Object..."+ref);
    }

    public void display(int i){}
    public void display(char i){}
    public void display(double i){}
    public void display(long i){}
    public void display(float i){}

    public static void main(String[] args) {
        OverloadingTest test=new OverloadingTest();
        test.display(null);                         // String ... null  more specific type will be used
        test.display(1);                             // int
        test.display(2.2);                           // double
        test.display(2.2f);                          // float
    }
}

/*

Types of Polymorphism in Java

Static Polymorphism	                              Dynamic Polymorphism
Method overloading	                              Method overriding
It uses compile-time binding	                  It uses late binding or runtime binding
Method invoked is based on the reference type	  Method invoked is based on the object type

 */