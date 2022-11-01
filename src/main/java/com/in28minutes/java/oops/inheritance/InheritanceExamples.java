package com.in28minutes.java.oops.inheritance;

abstract class Animal {
	String name;

	// cool functionality
	abstract String bark();

	String dugHole(){return  "Animal dug a hole";}
}

class Dog extends Animal {
	String bark() {
		return "Bow Bow";
	}

	String dugHole(){return  "Dog dug a hole";}
}

class WinterDog extends Dog{
	String bark() {return "Cold Bow Bow";}
}

class Cat extends Animal {
	String bark() {
		return "Meow Meow";
	}
}

public class InheritanceExamples {
	public static void main(String[] args) {
		Animal animal = new Dog();
		System.out.println(animal.bark());

		Animal animal1 = new WinterDog();
		System.out.println(animal1.dugHole());
	}
}
