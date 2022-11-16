package com.ocp.java._07.ioandnio.serialisation;

import java.io.*;

class ImportantBook implements Serializable{
    private String author;
    private String isbn;
    private int authorAge;

    public ImportantBook(String author, String isbn, int authorAge) {
        this.author = author;
        this.isbn = isbn;
        this.authorAge = authorAge;
    }

    @Override
    public String toString() {
        return "ImportantBook{" +
                "author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        ObjectOutputStream.PutField fields = oos.putFields();
        fields.put("author", author);
        fields.put("isbn", isbn);
        oos.writeFields();
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        ObjectInputStream.GetField fields = ois.readFields();
        author = (String) fields.get("author", null);
        isbn = (String) fields.get("isbn", null);
    }
}

public class C106CustomSerialization {

    public static void main(String[] args) {


        // Serialization
        try(var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("important_book.ser")))){
            ImportantBook b = new ImportantBook("Sanjiv Katiyar", "222-2-222-222", 35);
            System.out.println("BEFORE: " + b);
            out.writeObject(b);
        } catch (IOException ex){
            ex.printStackTrace();
        }

        // Deserialization
        try(var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("important_book.ser")))){
            ImportantBook b = (ImportantBook) in.readObject();
            System.out.println("AFTER: " + b);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
