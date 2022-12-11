package ocp.java._04.arraysandcollections.generics;

import java.util.ArrayList;
import java.util.List;

class Cat extends Animal{}

public class UnboundedWildCard {

    //public static void showList(List<Object> list){             // not okay
    public static void showList(List<?> list){                    // List<?> means list of whatever
        for (Object o:list){
            System.out.println(o);
        }
        // list.add("434");                                       // <?> implies read only
    }

    public static void main(String[] args) {

        // A different variation
        List<String> names = new ArrayList<String>();
        names.add("Sanjiv");
        showList(names);
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        showList(dogs);
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        showList(cats);

    }
}
