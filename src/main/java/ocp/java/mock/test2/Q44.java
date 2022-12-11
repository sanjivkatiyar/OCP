package ocp.java.mock.test2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String genre;
    private String author;
    //constructors and accessors not shown

    public Book(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }
}

public class Q44 {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("There is a hippy on the highway", "Thriller", "James Hadley Chase"),
                new Book("Coffin from Hongkong", "Thriller", "James Hadley Chase"),
                new Book("The Client", "Thriller", "John Grisham"),
                new Book("Gone with the wind", "Fiction", "Margaret Mitchell"));
        Map<String, Map<String, List<Book>>> classified = null;
        classified = books.stream().collect(Collectors.groupingBy(
                // this line is also a fine alternative //x->x.getGenre(), Collectors.groupingBy(x->x.getAuthor())  B
                Book::getGenre, Collectors.groupingBy(Book::getAuthor)));
        System.out.println(classified);
    }
}
// {Thriller={James Hadley Chase=[com.ocp.java.mock.test2.Book@5f184fc6, com.ocp.java.mock.test2.Book@3feba861], John
// Grisham=[com.ocp.java.mock.test2.Book@5b480cf9]}, Fiction={Margaret Mitchell=[com.ocp.java.mock.test2
// .Book@6f496d9f]}}
