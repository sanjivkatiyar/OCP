package ocp.java._04.arraysandcollections.generics;

import java.util.ArrayList;
import java.util.List;

class Terrier extends Dog {}
class Manx extends Cat{}

public class SuperAndExtends {

    public static void addAnimal(Animal[] animals){
        animals[0] = new Dog();
        animals[1] = new Cat();             // ArrayStoreException compiler knows the type
    }

    public static void addAnimal(List<Animal> animals){
        animals.add(new Dog());
    }

    public static void ext(List<? extends Animal> list) {
        // list.add   // compile time error
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void spr(List<? super Dog> list) {
        // list.add   // compile time error
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        // 1a. Polymorphic assignment
        // Generics came in java 5. Type erasure required to support legacy code.
        // Thus, generics offer compile time protection
        // Arrays have similar issues (Polymorphic assignment) bu the difference is how the compiler and JVM
        // behave. Due to type erasure with generics the JVM does not know the types; with arrays and JVM does.

        // First, let's look at arrays
        Dog[] dog0 = {new Dog(), new Dog()};
        addAnimal(dog0);

        // polymorphism ok for the base type; List -> ArrayList
        List<Cat> cats1 = new ArrayList<Cat>();

        // polymorphism not ok for the generic type; Animal -> Cat
        //List<Animal> animals = new ArrayList<Cat>();

        List<Cat> cats2 = new ArrayList<Cat>();  // generic type on both sides must match
        List<Cat> cat3 = new ArrayList<>();      // or use type inference
        // As the JVM does not know the types (stripped out during type erasure),  the compiler
        // has to step in.
        // addAnimal(cats2);

        // 1b. 'extends' - polymorphic assignments
        // Note: extends is read-only
        List<? extends Animal> animals1 = new ArrayList<Animal>();
        // animals1.add(new Animal());            // read only
        List<? extends Animal> animal2 = new ArrayList<Dog>();
        List<? extends Animal> animal3 = new ArrayList<Terrier>();
        List<? extends Animal> animal4 = new ArrayList<Cat>();
        List<? extends Animal> animal5 = new ArrayList<Manx>();
        // List<? extends Animal> animal6 = new ArrayList<Object>();   // compilation error

        // 1c. 'super' - polymorphic assignments
        List<? super Dog> dog1 = new ArrayList<Dog>();
        dog1.add(new Dog());                      // now can add to list
        List<? super Dog> dog2 = new ArrayList<Animal>();
        List<? super Dog> dog3 = new ArrayList<Object>();
        // List<? super Dog> dog4 = new ArrayList<Terrier>();         // compilation error

        // 2. declarations for 'extends' and 'super' examples
        List<Object> objects = new ArrayList<>(); objects.add(new Object());
        List<Animal> animals = new ArrayList<>(); animals.add(new Animal());
        List<Cat> cats = new ArrayList<>(); cats.add(new Cat());
        List<Manx> manCats = new ArrayList<>(); manCats.add(new Manx());
        List<Dog> dogs = new ArrayList<>(); dogs.add(new Dog());
        List<Terrier> terriers = new ArrayList<>(); terriers.add(new Terrier());

        ext(animals);
        ext(cats);
        ext(dogs);
        ext(manCats);
        ext(terriers);
        // ext(objects);   // compilation error   // upper-bound

        spr(dogs);
        spr(animals);
        spr(objects);
        //spr(cats);      // compilation error lower bound

    }


}
