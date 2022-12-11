package ocp.java.mock.test2;

import java.io.FileInputStream;
import java.io.IOException;

public class Q26 {

    public static void main(String[] args) {
        FileInputStream tempFis = null;
        try (FileInputStream fis = new FileInputStream("c:\\temp\\test.text")) {
            System.out.println(fis);
            tempFis = fis;
        } catch (IOException | NullPointerException e) {
//        } finally {
//            tempFis.close();
//        } file close will require throwing or handle exception
            //line 1
            // catch(IOException|FileNotFoundException e){ }
            //The exceptions listed in a multi-catch clause must not be in a subclass relationship with each other.
            // Since FileNotFoundException is a subclass of IOException, this code won't compile.
        }
    }
}
