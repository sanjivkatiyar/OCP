package com.ocp._01.datatypes.PremitiveAndNonPremitive;

public class Test {

    boolean aBoolean;
    char aChar;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;


    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.aBoolean);         // false
        System.out.println(test.aChar);            //
        System.out.println(test.aByte);            // 0
        System.out.println(test.aShort);           // 0
        System.out.println(test.anInt);            // 0
        System.out.println(test.aLong);            // 0
        System.out.println(test.aFloat);           // 0.0
        System.out.println(test.aDouble);          // 0.0
    }
}

/*

Primitive Data Types :
It holds the value of the data item
Example: int, float

Non-primitive Data Types :
It holds the memory address where the data item (object) is stored.
It is also known as Reference datatypes
Examples: Classes, enum
 */

/*

Default value and size :

Datatype	Default Value	Default size (1 byte = 8 bit)
boolean	    false	        1 bit (depends on JVM)
char	    '\u0000'	    2 byte
byte	    0	            1 byte
short	    0	            2 byte
int	        0	            4 byte (-2^31 (-2,147,483,648) and +2^31-1 (2,147,483,647))  // 10 digits
long	    0L	            8 byte
float	    0.0f	        4 byte (3.40282e+38 and -3.40282e+38)
double	    0.0d	        8 byte
 */