package com.ocp._16.Enum;

public class Test {
}

enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    private int value;

    private Day(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

class UserInterface {
    public static void main(String[] args) {
        //printing all constants of an enum
        for (Day day : Day.values())
            System.out.println("Day:" + day.name() + " Value:" + day.getValue());
    }
}

/*
Enum:

An enum is a non-primitive data type that contains a fixed set of constants.
All the constants are static and final implicitly.
All enums implicitly extend java.lang.Enum class.
Constructors, methods, and variables in an enum can be defined
as enums are reference data type like class or interface.

 */