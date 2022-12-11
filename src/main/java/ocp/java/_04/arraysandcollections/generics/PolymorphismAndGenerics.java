package ocp.java._04.arraysandcollections.generics;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismAndGenerics {

    public static void showList(List<Object> list){
        for (Object o:list){
            System.out.println(o);
        }
        list.add("434");                                       // ok
    }

    public static void main(String[] args) {

        // Polymorphism is not allowed to generic type
        // List<Number> myList = new ArrayList<Double>();       // compilation error

        List<Double> doubles = new ArrayList<Double>();
        doubles.add(12.3);

        // List<Object> objects = doubles;                      // compilation error
        // objects.add("This is a string");

        // A different variation
        List<String> names = new ArrayList<String>();
        names.add("Sean");
        //showList(names);                                      // compilation error
    }
}
