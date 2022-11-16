package com.ocp.java._02.oops;

public class C32Inheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(v.toString());
        Boat b = new Boat();
        System.out.println(b);
    }
}

class Vehicle extends Object{ // a Vehicle is-an Object

    @Override
    public String toString() {
        return "Vehicle";
    }
}
class Car extends Vehicle{ // a Car is-a Vehicle
    @Override
    public String toString() {
        return "Car";
    }
}
class Boat extends Vehicle{} // a Boat is-a Vehicle
class Saloon extends Car{}   // a Saloon is-a Car, a Saloon is-a Vehicle
class Convertible extends Car{} // a Convertible is-a Car, a Convertible is-a Vehicle


