package ocp.java.mock.test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book {
    private String title;
    private String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

public class Q2 {

    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();
        books.add(new Book("HeHe", "Fun"));
        books.add(new Book("HaHa", "Run"));

                Comparator <Book> c1 =  (b1, b2)->b1.getGenre().compareTo(b2.getGenre()); //1
        books.stream().sorted(c1.thenComparing(Book::getTitle)).peek(System.out::println); //2          // thenComparing Method
        books.forEach(System.out::println);          // We are printing original source here

        // 1. Manipulating a stream doesn't manipulate the backing source of the stream. Here,
        // when you chain the sorted method to a stream, it returns a reference to a Stream that appears sorted.
        // The original List which was used to create the stream will remain as it is.

        // If you want to sort a List permanently, you should use one of the Collections.sort methods.

        // 2. There is another issue with this code. Stream.sorted is an intermediate operation.
        // It will not be executed until a terminal operation is invoked on the stream.
        // Therefore, in this case, the sorted method will not even be invoked.

        // Comparator is a functional interface and the lambda expression captures it correctly.

        /*
        Here, the argument to thenComparing is a method reference to a method that returns a String.
        This obviously does not capture Comparator interface. However,
        Comparator has three flavors of thenComparing method.
        One of them takes a Function (instead of a Comparator).
        It is this method that is being used here.  public <U extends Comparable<? super U>> Comparator<T>
        thenComparing(Function<? super T,? extends U> keyExtractor)
        This method uses the supplied Function to get a value from the objects to be compared
        and then compares that value. The value returned by the function must be Comparable.
        The third flavor of thenComparing is similar to the second except that the value returned by the function
        is compared using a given Comparator: public <U> Comparator<T> thenComparing(Function<? super T,? extends U>
        keyExtractor, Comparator<? super U> keyComparator) Returns a lexicographic-order comparator
        with a function that extracts a key to be compared with the given Comparator.
        This is useful when the value returned by the Function does not implement Comparable.
         */

    }
}

