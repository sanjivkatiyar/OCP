package ocp.java._04.arraysandcollections.collections1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingSets {
    public static void main(String[] args) {
        factoryMethods();
        treeSet();
        hashSet();
        linkedHashSet();
    }

    public static void factoryMethods(){
        // un-modifiable sets returned
        Set<String> of = Set.of("San", "Man", "Tan");
        Set<String> copy = Set.copyOf(of);
        // of.remove("Dan");                                // Unsupported operation exception
        // of.add("Dan");                                   // Unsupported operation exception
        // copy.add("Dan");                                 // Unsupported operation exception
    }

    // sorted String in alphabetical order, integer in numerical order
    // No duplicate elements
    public static void treeSet(){
        Set<String> names = new TreeSet<>();
        names.add("John");
        names.add("John");
        names.add("Helen");
        names.add("Anne");
        names.add("john");                    // lower case will come latter in order
        System.out.println(names);            // [Anne, Helen, John, john]

        Set<Integer> numbers = new TreeSet<Integer>();
        numbers.add(23);
        numbers.add(Integer.valueOf("21"));
        numbers.add(Integer.valueOf("11"));
        System.out.println(numbers);          // [11, 21, 23]
    }

    public static void hashSet(){
        Set<Contact> contactsHS = new HashSet<>();
        contactsHS.add(new Contact("zoe", 45));
        contactsHS.add(new Contact("zoe", 45));         // Zoe added only once to set
        contactsHS.add(new Contact("Alice", 34));
        contactsHS.add(new Contact("andrew", 35));
        contactsHS.add(new Contact("brian", 36));
        contactsHS.add(new Contact("carol", 37));
        contactsHS.add(new Contact("carol", 38));
        contactsHS.forEach(System.out::println);
    }

    public static void linkedHashSet(){
        // keeps insertion order
        Set<Contact> contactsHS = new LinkedHashSet<>();
        contactsHS.add(new Contact("zoe", 45));
        contactsHS.add(new Contact("zoe", 45));
        contactsHS.add(new Contact("Alice", 34));
        contactsHS.add(new Contact("andrew", 35));
        contactsHS.add(new Contact("brian", 36));
        contactsHS.add(new Contact("carol", 37));
        contactsHS.add(new Contact("carol", 38));
        contactsHS.forEach(System.out::println);
    }

}