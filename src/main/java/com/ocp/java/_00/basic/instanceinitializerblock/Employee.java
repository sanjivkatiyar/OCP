package com.ocp.java._00.basic.instanceinitializerblock;

public class Employee {
    private String name = "Mark";

    {
        System.out.println("Setting instance block");
    }

    static {
        System.out.println("Setting static block");
    }
    public Employee() {
        name = "Mike";
        System.out.println("Setting constructor");
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.name);
    }
}
