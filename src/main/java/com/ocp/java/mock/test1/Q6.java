package com.ocp.java.mock.test1;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q6 {
    public static void main(String[] args) {
        try (Reader r = new BufferedReader(new FileReader("c://temp//test.txt"))) {
            if (r.markSupported()) {
                BufferedReader in = (BufferedReader) r;
                System.out.print(in.readLine());
                in.mark(100);
                System.out.print(in.readLine());
                System.out.print(in.readLine());
                in.reset();
                System.out.print(in.readLine());
                in.reset();
                System.out.println(in.readLine());
            } else {
                System.out.println("Mark Not Supported");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
A Reader object just gives you a readable stream. Normally,
you cannot go back in a stream to read the data that has already been read.
However, some readers do allow this facility by maintaining the data in a buffer.
The markSupported, mark, and reset methods help you go back and forth in the data stream if the underlying reader supports it.
They allow you to set a point in the stream by calling the mark method.
This point is like a bookmark in a book. You can return back to the same point by calling the reset method.
Any call to read after reset will return the data right after the bookmark.
BufferedReader does provide this facility, therefore r.markSupported() returns true.
Now, the mark method sets the bookmark in the stream right after A.
The parameter 100 is the limit on the number of characters that may be read while still preserving the mark.
The two readLines calls after calling mark will return B and C.
The call to reset will move the reader back to point right after A and therefore, the subsequent call to readline will return B.
The second call to reset will again move the reader back to the point after A.
The final call to readLine will thus return B.
 */