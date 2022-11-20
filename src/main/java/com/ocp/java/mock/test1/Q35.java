package com.ocp.java.mock.test1;

public class Q35 {

    public static void main(String[] args) {

        String str = "    ";
        System.out.println(!str.isBlank());                     // false
        System.out.println(!str.isEmpty());                     // true
        System.out.println(str.strip() != "");                  // false
        // System.out.println(!str.equalsIgnoreBlanks(""));     // there is not such method
        System.out.println(str.compareTo("") != 0);             // true
    }

}
// isBlank() returns true if the string is empty or contains only white space codepoints, otherwise false.

// isEmpty returns true if, and only if, length() is 0. Thus, it will return false even if the string contains only spaces.

// String comparisons should never be done using == or != operators because these operators
// check whether two references point to the same object or not (instead of checking the contents).
// For a String that contains only white spaces, str.strip() will return an empty string,
// however, that empty string object may be different a one from "".
// Therefore, the reference returned by strip() may not be same as "" and the test will fail.

// String does have a compareTo method but unless you strip the string from its leading and trailing white spaces,
// a string containing just the white spaces will not match with "". Therefore, this is not a right test. You could do:
// str.strip().compareTo("") != 0