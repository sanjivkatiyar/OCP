package com.ocp.java.mock.test2;

public class Q3 {

    // Upper case M is for Month and lower case y is for Calendar Year.
}
/*

For the purpose of the exam, you need to know the basic codes for printing out a date. The important ones are m, M, d, D, e, y, s, S, h, H, and z.
You should check the complete details of these patterns here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html

The important point to understand is how the length of the pattern determines the output of text and numbers.

Text: The text style is determined based on the number of pattern letters used. Less than 4 pattern letters will use the short form.
Exactly 4 pattern letters will use the full form. Exactly 5 pattern letters will use the narrow form.
Pattern letters 'L', 'c', and 'q' specify the stand-alone form of the text styles.

Number: If the count of letters is one, then the value is output using the minimum number of digits and without padding.
Otherwise, the count of digits is used as the width of the output field, with the value zero-padded as necessary.
The following pattern letters have constraints on the count of letters.
Only one letter of 'c' and 'F' can be specified.
Up to two letters of 'd', 'H', 'h', 'K', 'k', 'm', and 's' can be specified. Up to three letters of 'D' can be specified.

Number/Text: If the count of pattern letters is 3 or greater, use the Text rules above. Otherwise use the Number rules above.
 */