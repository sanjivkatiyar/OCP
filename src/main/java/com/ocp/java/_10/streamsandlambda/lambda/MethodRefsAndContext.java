package com.ocp.java._10.streamsandlambda.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefsAndContext {

    public static void main(String[] args) {

        // No person being passed in => Supplier
        Supplier<Integer> lambda1 = () -> Person.howMany();
        Supplier<Integer> lambdaMR = Person::howMany;
        System.out.println(lambda1.get());

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return Person.howMany();
            }
        };

        System.out.println(supplier.get());

        // One person being passed in => Function
        Function<Person, Integer> lambda2 = Person::howMany;
        System.out.println(lambda2.apply(new Person()));

        // two people being passed in => BiFunction
        BiFunction<Person,Person, Integer> lambda3 = Person::howMany;
        BiFunction<Person,Person, Integer> lambda4 = (p1,p2) -> Person.howMany(p1,p2);

        System.out.println(lambda3.apply(new Person(), new Person()));

    }
}

class Person{
    public static Integer howMany(Person... people){
        return people.length;
    }
}
