package com.ocp.java._13.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEffectivelyFinal {

    String name = "";

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("John");

        int x=12;                                           // final or effectively final

        //x ++;                                             // error line no 26
        // lambda take a snapshot/picture of local variables
        // these local variables must not change
        Predicate<String> lambda = s ->{

            //x++;                                          // error at this line
            new LambdaEffectivelyFinal().name = "Sanjiv";   // instance/class variables are okay
            System.out.println("x == " + x);
            return s.isEmpty() && x%2 == 0;
        };

        //x++;                                              // error at line no 26

        filterData(al, lambda);                             // lambda views 'x' as 12

        System.out.println(al);

        new LambdaEffectivelyFinal().name = "Katiyar";      //ok
    }

    public static void filterData(List<String> list, Predicate<String> lambda){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(lambda.test(iterator.next())){
                iterator.remove();
            }
        }

        list.removeIf(lambda::test);
    }
}
