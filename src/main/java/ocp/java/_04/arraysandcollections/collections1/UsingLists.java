package ocp.java._04.arraysandcollections.collections1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingLists {
    public static void main(String[] args) {
        factoryMethods();
        arrayList();
        stack();
        linkedList();
    }

    public static void factoryMethods() {
        String[] array = new String[]{"Alpha", "Beta", "Charlie"};
        List<String> asList = Arrays.asList(array);             // add/delete not allowed, array and asList are backed
        List<String> of = List.of(array);                       // immutable
        List<String> copy = List.copyOf(asList);                // immutable, array and copy are not backed

        array[0] = "Delta";                                    // Change to array, write through the list. not to copy
        System.out.println(Arrays.toString(array));            // [Delta, Beta, Charlie]
        System.out.println(asList);                            // [Delta, Beta, Charlie]
        System.out.println(of);                                // [Alpha, Beta, Charlie]
        System.out.println(copy);                              // [Alpha, Beta, Charlie]

        asList.set(1, "Echo");              // changes to list and write through array
        System.out.println(Arrays.toString(array));            // [Delta, Echo, Charlie]
        System.out.println(asList);         // changed         // [Delta, Echo, Charlie]
        System.out.println(of);             // no change       // [Alpha, Beta, Charlie]
        System.out.println(copy);           // no change       // [Alpha, Beta, Charlie]

        // of.set(1, "Gama");              // immutable Collection, un-supported operation at run time
        // of.add("gama");                 // immutable Collection, un-supported operation at run time
        // copy.add("gama");               // immutable Collection, un-supported operation at run time
        // copy.set(1,"gama");             // immutable Collection, un-supported operation at run time
        // asList.add("Gama");             // add/delete is not allowed
    }

    public static void arrayList() {
        // LOD - Lord of the dance
        // List maintains order (index) and allows Duplicates
        List<String> list = new ArrayList<>();
        list.add("Alan");
        list.add("Alan");
        list.add("Sean");
        list.add("Mary");
        list.add("Mary");
        System.out.println(list);                      // [Alan, Alan, Sean, Mary, Mary]
        list.forEach(System.out::println);
        list.forEach(name -> System.out.println(name));
        System.out.println(list.get(1));               // Alan
        list.remove(0);
        list.remove("Mary");                        // removes the first occurrence
        System.out.println(list);                      // [Alan, Sean, Mary]
        list.set(0, "Jack");
        System.out.println(list);                      // [Jack, Sean, Mary]
        list.add(null);
        System.out.println(list);                      // [Jack, Sean, Mary, null]
        list.add(null);
        list.remove(null);            //okay
        // list.removeAll(null);         // null pointer
        list.add(null);
        System.out.println(list);                     // [Jack, Sean, Mary, null, null]
        Collection<String> remCol = new ArrayList<>();
        remCol.add(null);
        list.removeAll(remCol);
        System.out.println(list);                     // [Jack, Sean, Mary]

    }

    public static void stack() {
        // Stack is LEFO, manipulation at top only
        // legacy class, use Deque interface instead
        Stack<String> stack = new Stack<>();
        stack.push("Andrea");
        stack.push("Barbara");
        stack.push("Caroline");
        stack.forEach(System.out::println);
        System.out.println(stack.peek());  // return top               // Caroline
        System.out.println(stack.pop());  // remove top and return it  // Caroline
        System.out.println(stack);                                     // [Andrea, Barbara]
    }

    public static void linkedList() {
        // A doubly linked list, We can manipulate both ends or anywhere
        LinkedList<String> liList = new LinkedList<>();
        liList.add("Colin");
        liList.add("David");
        liList.add("Brian");
        liList.add("Edward");                    // returns true
        liList.addLast("Edward");             // void
        liList.addFirst("Sanjiv");
        System.out.println(liList);              // [Sanjiv, Colin, David, Brian, Edward, Edward]
        liList.add(3, "Sanjiv");
        liList.forEach(System.out::println);
        liList.remove("Sanjiv");
        System.out.println(liList);              // [Colin, David, Sanjiv, Brian, Edward, Edward]
        liList.removeFirst();
        liList.removeLast();
        System.out.println(liList);              // [David, Sanjiv, Brian, Edward]
        liList.removeFirstOccurrence("Sanjiv");  // same a remove
        System.out.println(liList);              // [David, Brian, Edward]
        liList.stream()
                .filter(name -> name.startsWith("B"))
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}