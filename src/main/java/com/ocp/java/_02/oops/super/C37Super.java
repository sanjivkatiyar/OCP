package com.ocp.java._02.oops;

public class C37Super {
    public static void main(String[] args) {
        Director dir = new Director(754, "Shreyas Katiyar", "Kids", 1_000_000.00);
        System.out.println(dir);
    }
}

class Employee{
    private int empId; // composition - "Has-A" relationship
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Employee ID: " +empId+"\n" +
                "Employee Name: "+name;
    }
}

class Manager extends Employee{       // Manager is-a Employee
    private String deptName;          // Manager has-a department

    public Manager(int empId, String name, String deptName) {
        super(empId, name);
        this.deptName = deptName;
    }
    @Override
    public String toString(){
        return super.toString() + "\nDepartment: " + deptName;
    }
}

class Director extends Manager{
    private double budget;

    public Director(int empId, String name, String deptName, double budget) {
        super(empId, name, deptName);
        this.budget = budget;
    }
    public String toString(){
        return super.toString() + "\nBudget: " + budget;
    }
}
