package ocp.java._10.streamsandlambda.streams;

import java.util.Comparator;
import java.util.stream.Stream;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class IntermediateOperationsSorted {

    // Stream<T> sorted(Comparator<T> comparator)
    public static void main(String[] args) {

        Person john = new Person("John", 35);
        Person mary = new Person("Marry", 39);
        Person frank = new Person("frank", 30);

        Stream.of(john, mary, frank)
                .sorted(Comparator.comparing(person -> person.getAge()))
                .forEach(System.out::println);
                /*
                Person{name='frank', age=30}
                Person{name='John', age=35}
                Person{name='Marry', age=39}
                 */

        // Stream<T> sorted()
        Stream.of(111,11,22,33,44,55,66,77,88,99)
                //.peek(n -> System.out.print(" A - " + n))
                .filter(n -> n > 40)
                //.peek(n -> System.out.print(" B - " + n))
                .limit(2)
                .sorted()
                .forEach(n -> System.out.print(" C - " + n));
                //  C - 44 C - 111
    }
}


