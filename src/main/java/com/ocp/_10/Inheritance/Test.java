package com.ocp._10.Inheritance;

public class Test {
}

class Loan {
    int tenure;
    float interestRate;
    public double calculateEMI(double principal) {
        double simpleInterest = (principal * interestRate * tenure) / 100;
        double emi = (simpleInterest + principal) / tenure;
        return emi;
    }
    // ...
}
class HomeLoan extends Loan {   // Inheritance
    int tenure = 10;
    HomeLoan() {                // Reusing super class member variables
        super.tenure = 5;       // super's tenure
        interestRate = 8.5f;    // super's interestRate
    }
    public static void main(String[] args) {
        HomeLoan hloan = new HomeLoan();
        double amount = hloan.calculateEMI(200000);   // Calling super class member method
        System.out.println("HomeLoan emi per year..." + amount);
    }
}


class Loan1 {
    int tenure;
    double principal;
    float interestRate;
    String accountNumber;
    public double calculateEMI(){
        double simpleInterest = (principal*interestRate*tenure)/100;
        return (simpleInterest+principal)/tenure;
    }
}
class HomeLoan1 extends Loan1 {
    HomeLoan1() {
        tenure = 5; //reusing super class member variables
        principal = 20000;
        interestRate = 8.5f;
        accountNumber = "Acc12345";
    }

    public static void main(String[] args) {
        HomeLoan1 hloan = new HomeLoan1();
        double amount = hloan.calculateEMI();   // sub class Object
        hloan.accountNumber = "100";

        // invoking super class method
        System.out.println("emi per year..." + amount);
    }
}


class Person{
    String name;
    Person(){
        System.out.println("In Person class");
    }
}
class Student extends Person{
    Student(){
        System.out.println("In Student class");
    }
    int id;
    public static void main(String[] a){
        Student ob=new Student(); //Line 1
        ob.name="abc"; //Line 2
        ob.id=123;}
}

