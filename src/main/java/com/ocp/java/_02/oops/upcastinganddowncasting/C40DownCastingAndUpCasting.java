package com.ocp.java._02.oops.upcastinganddowncasting;

public class C40DownCastingAndUpCasting {
    public static void main(String[] args) {
        Animal2 aa = new Animal2();
        aa.eat();                                   // Animal2::eat(). polymorphism -> object type

        Animal2 ad = new Dog2();
        ad.eat();                                   // Dog2::eat(). polymorphism -> object type

        System.out.println(ad.name);                // Animal2, data -> reference type

        ad.walk();                                  // Animal2::walk(), static method, reference type

        Dog2 dog = (Dog2)ad;
        dog.bark();

        Dog2 dog1 = (Dog2)aa;
        dog1.bark();
    }
}

class Animal2 {
    String name = "Animal2";
    public void eat(){
        System.out.println("Animal2::eat()");
    }
    public static void walk(){
        System.out.println("Animal2::walk()");
    }
}

class Dog2 extends Animal2{
    String name = "Dog2";
    public void eat(){
        System.out.println("Dog2::eat()");
    }
    public static void walk(){                              // not an overriding but hiding as method is static
        System.out.println("Dog2::walk()");
    }
    public void bark(){                                     // extra method
        System.out.println("Dog2::bark()");
    }
}