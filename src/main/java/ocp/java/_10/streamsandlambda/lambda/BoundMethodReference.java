package ocp.java._10.streamsandlambda.lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class BoundMethodReference {
    public static void main(String[] args) {

        String name = "Sanjiv Katiyar";

        // Supplier<T>
        //      T get()
        Supplier<String> supplier = () -> name.toLowerCase();    // lambda
        Supplier<String> supplier1 = name::toLowerCase;          // method reference

        // No need to say which instance to call it on - the supplier is bound to name
        System.out.println(supplier.get());
        System.out.println(supplier1.get());

        // Predicate<T>
        //      boolean test(T t)
        // Even though startsWith is overloaded, boolean startsWith(String) and boolean startsWith(String,int)
        // because we are creating a predicate which has a functional method of test(T t)
        // the startsWith(String) is used
        // this is where context is important
        Predicate<String> predicate = (title) -> name.startsWith(title);
        Predicate<String> predicate1 = name::startsWith;

        System.out.println(predicate.test("Sa"));
        System.out.println(predicate1.test("Sa"));
    }
}
