package ocp.java._07.ioandnio.serialisation;


import java.io.*;

class NoteBook extends InfoMedium implements Serializable {
    private String theAuthor;
    // private transient String theAuthor;
    BookMarker marker = new BookMarker();

    NoteBook(){
        theAuthor = "Unknown";
    }

    public String getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(String theAuthor) {
        this.theAuthor = theAuthor;
    }

    @Override
    public String toString(){
        return getTheMedium() + "; " + getTheAuthor();
    }
}

class BookMarker implements Serializable{
    //private Image i = new Image();
    private transient Image i = new Image();
}

class Image{}

//class Image implements Serializable{}

class InfoMedium {
    private String theMedium;

    InfoMedium(){
        theMedium = "Unknown";
    }

    public String getTheMedium() {
        return theMedium;
    }

    public void setTheMedium(String theMedium) {
        this.theMedium = theMedium;
    }
}

public class C105Serialization {

    public static void main(String[] args) {

        // Serialization
        try(var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("book.ser")))){
            NoteBook b = new NoteBook();
            b.setTheMedium("Print");
            b.setTheAuthor("Sanjiv Katiyar");
            System.out.println("BEFORE: " + b);
            out.writeObject(b);
        } catch (IOException ex){
            ex.printStackTrace();
        }

        // Deserialization
        try(var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("book.ser")))){
            NoteBook b = (NoteBook) in.readObject();
            System.out.println("AFTER: " + b);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
