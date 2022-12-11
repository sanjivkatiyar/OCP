package ocp.java._10.streamsandlambda.lambda;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // Consumer<T> is a functional interface i.e. one abstract method
        // void accept<T t>
        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept("Sanjiv Katiyar");
    }
}
