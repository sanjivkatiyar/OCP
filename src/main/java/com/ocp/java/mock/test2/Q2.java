package com.ocp.java.mock.test2;

public class Q2 {

    public static void main(String[] args) {
        String examName = "OCP Java 11";
        String uniqueExamName = new String(examName);
        String internedExamName = uniqueExamName.intern();
        System.out.println((examName == uniqueExamName) + " " + (examName == internedExamName) + " " + (uniqueExamName == internedExamName));
    }
}
/*

Here are a few points that you need to know to answer this question:

1. Java maintains a pool of strings, which is initially empty, but is filled gradually as and when the program uses constant strings.
All literal strings and string-valued constant expressions go into this pool.
Strings in this pool are said to be "interned". For example, in the given code, "OCP Java 11" is a string literal
and therefore goes into this interned pool of string.

But new String(examName); is neither a String literal nor a string-valued constant expression
(constant expressions that returns a string such as "hello"+" world"),
and therefore, it creates a new String object outside this string pool.

2. When the intern method is invoked on a String reference, if the pool already contains a string equal to this String object
as determined by the equals(Object) method, then the string from the pool is returned.
Otherwise, a new String object containing the same characters is added to the pool and a reference to this String object is returned.
For example, in the given code, when you call uniqueExamName.intern();, JVM checks whether the string referred to by uniqueExamName
is equal to any of the strings that exist in the string pool. In this case, yes, we already have "OCP Java 11" in the string pool.
Therefore, a reference to that same interned string is returned and is assigned to the internedExamName variable.
Thus, examName and internedExam name point to the same String object (which resided in the string pool).

3. The == operator checks whether two references point to the same object or not.
In the given code, examName and internedExamName variables point to the same interned string.
Therefore, only examName == internedExamName returns true.
String literals are defined in section 3.10.5 of the Java Language Specification.

 */