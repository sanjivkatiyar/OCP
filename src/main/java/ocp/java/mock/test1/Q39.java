package ocp.java.mock.test1;

import java.io.FileWriter;

public class Q39 {

    public static void main(String[] args) throws Exception {
        var fw = new FileWriter("text.txt");
        // fw.write("hello"); //1
        fw.close();
    }
}

/*
If the file does not exist, it will be created and data will be written to it.
If the file already exists, it will be overwritten with a new file.
To append to the existing file, the following constructor should be used.
public FileWriter(String fileName,boolean append)
 */