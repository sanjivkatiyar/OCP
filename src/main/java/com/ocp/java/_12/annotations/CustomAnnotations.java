package com.ocp.java._12.annotations;

enum Device{LAPTOP, PHONE}

// 1. Define the annotation.
// Can be public or package-private
@interface Human{}                            // marker annotation (no element)

@interface OnWeb{
    // The elements - abstract and public by default
    // - can't be protected, private, or final
    int startTime() default 9;               // optional (due to default value)
    public abstract int hoursPerDay();       // required element (no default value)

    // As in interface, values are public static final by default.
    // Constants are not considered elements -> marker interface can have constants.
    int PEAK_TIME_START=19;
    public static final int PEAK_TIME_END=22;

    // The element type must be a primitive type, a String, an enum, class, another annotation or an 1-D array.
    //Integer turnOff();                     // Wrapper type not allowed
    //Book book();                           // Object type not allowed
    String name() default "SK";
    Device consume() default Device.LAPTOP;
    Class humanOrBot() default Human.class;
    Human extraInfo() default @Human;        // Note: "new" keyword never used for annotations
    String[] sites() default {"S", "K"};     // 1-D array only

}

// 2. Apply the annotation.
@OnWeb(hoursPerDay = 4) @Human class Student{}

@OnWeb(hoursPerDay = 4, startTime = 3)
@Human
class Worker{}

public class CustomAnnotations {
}
