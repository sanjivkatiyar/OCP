package ocp.java._04.arraysandcollections.collections1;
import java.util.*;

public class UsingQueues {
    public static void main(String[] args) {
        linkedListQueue();
        arrayDeque();
        priorityQueueNaturalOrdering();
        priorityQueueCustomOrdering();
    }

    public static void linkedListQueue(){
        // A FIFO queue (First in First out)
        Queue<Integer> queue = new LinkedList();
        // add() inserts into queue (throws exception if no space exists - if capacity restricted)
        // offer() inserts into queue (returns false if no space exists - capacity restricted)
        queue.add(1);
        System.out.println(queue);           // [1]
        queue.offer(2);
        System.out.println(queue);           // [1, 2]
        queue.add(3);
        System.out.println(queue);           // [1, 2, 3]
        queue.offer(4);
        System.out.println(queue);           // [1, 2, 3, 4]

        // element() retrieves but does not remove the head of the queue (throws exception if queue empty)
        // peek() retrieves but does not remove the head of the queue (returns null if queue is empty)
        System.out.println(queue.element()); // 1
        System.out.println(queue.peek());    // 1

        // remove() - Retrieves and removes the head of the queue (throws exception if queue is empty)
        // poll() - Retrieves and removes the head of the queue (returns null if queue is empty)

        System.out.println(queue.remove());  // 1
        System.out.println(queue.poll());    // 2
        System.out.println(queue);           // [3, 4]

        // offer(), poll() and peek() are preferred methods as they do not throw exceptions. (P.O.P.)
    }

    public static void arrayDeque(){
        // Deque = "doubly ended queue". Supports element insertion/removal at both ends.
        // ArrayDeque - resizeable-array implementation of the Deque interface (no capacity restrictions)

        Deque<Integer> numbers = new ArrayDeque<>();
        // a.r.g - Deque methods that begins with a, r or g  e.g. addFirst(), addLast(),
        // removeFirst(), removeLast(), getFirst() and getLast() all throw exception if the deque is
        // both capacity constrained and full.
        // the other methods (P.O.P.) i.e. peekFirst(), peekLast(), offerFirst(), offerLast(), pollFirst()
        // pollLast() returns null/false rather than throwing exception.

        // add a front (the head)
        numbers.add(1);
        System.out.println(numbers);               // [1]
        numbers.addFirst(2);
        System.out.println(numbers);               // [2, 1]
        numbers.offerFirst(3);
        System.out.println(numbers);               // [3, 2, 1]
        System.out.println(numbers.getFirst());    // 3
        System.out.println(numbers.peekFirst());   // 3
        System.out.println(numbers.peek());        // 3

        // add at the end (the tail)
        numbers.addLast(4);                     // [3, 2, 1, 4]
        System.out.println(numbers);
        numbers.offerLast(5);
        System.out.println(numbers);               // [3, 2, 1, 4, 5]

        // remove elements from both ends
        numbers.removeFirst();
        System.out.println(numbers);               // [2, 1, 4, 5]
        numbers.pollFirst();
        System.out.println(numbers);               // [1, 4, 5]
        numbers.removeLast();
        System.out.println(numbers);               // [1, 4]
        numbers.pollLast();
        System.out.println(numbers);               // [1]

        // The common peek(), offer() and poll() in use
        System.out.println(numbers.offer(11));  // true
        System.out.println(numbers.offer(12));  // true
        System.out.println(numbers.peek());        // 1
        System.out.println(numbers.poll());        // 1
        System.out.println(numbers.poll());        // 11
        System.out.println(numbers.poll());        // 12
        System.out.println(numbers.poll());        // null
    }

    public static void priorityQueueNaturalOrdering(){
        // Natural ordering
        Queue<String> names = new PriorityQueue<>();  // alphabetical order only when use iterator
        names.add("V");
        names.add("P");
        names.add("A");
        System.out.println(names);                     // [A, V, P]
        names.forEach(System.out::print);              // AVP

        Iterator<String> itNames = names.iterator();
        while (itNames.hasNext()){
            System.out.print(names.poll() + " ");      // A P V
        }

        names.forEach(System.out::println);

        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(11);
        numbers.add(5);
        numbers.add(2);
        System.out.println(numbers);                   // [2, 11, 5]

        Iterator itNumbers = numbers.iterator();
        while (itNumbers.hasNext()){
            System.out.print(numbers.poll());          // 2511
        }

    }

    public static void priorityQueueCustomOrdering(){
        Comparator<Book> comparatorTitle = Comparator.comparing(book->book.getTitle());
        Comparator<Book> comparatorPrice = Comparator.comparing(Book::getPrice);

        Queue<Book> bookByTitle = new PriorityQueue<>(comparatorTitle);
        bookByTitle.add(new Book("Java", 55.0));
        bookByTitle.add(new Book("Python", 23.0));
        bookByTitle.add(new Book("C++", 99.0));

        System.out.println(bookByTitle);                   // [	C++	99.0, 	Python	23.0, 	Java	55.0]

        Iterator<Book> itBooks = bookByTitle.iterator();
        while (itBooks.hasNext()){
            System.out.println(bookByTitle.poll());
        }
        /*
        C++	99.0
	    Java	55.0
	    Python	23.0
         */

        Set<Book> list = new TreeSet<>(comparatorTitle);
        list.add(new Book("Java", 55.0));
        list.add(new Book("Python", 23.0));
        list.add(new Book("C++", 99.0));
        list.forEach(System.out::println);
        /*C++	99.0
        Java	55.0
        Python	23.0
        */

    }

}

class Book{
    private String title;
    private Double price;

    Book (String title, Double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String toString(){
        return "\t" + title + "\t" + price;
    }
}