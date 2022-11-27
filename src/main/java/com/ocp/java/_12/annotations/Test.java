package com.ocp.java._12.annotations;

public class Test {
}

@interface BookData {
    String bookName();
    int bookPrice() default 100;
}
@BookData(bookPrice = 150, bookName = "Effective Java")
class MorningBatch {
}
@BookData(bookName = "Clean Code")
class EveningBatch {
}
// @BookData(bookName = "Spring in Action", bookPrice = "180") // DOES NOT COMPILE incompatible type
class WeekendBatch {
}

@interface BadAnnotation {
    // String name() default new String(""); // DOES NOT COMPILE Attribute value must be constant
    String address() default "";
    // String title() default null; // DOES NOT COMPILE attribute value must be constant
}

class Employee {
}
enum Shift {
    DAY, NIGHT
}
@interface FullTimeEmployee {
    // Integer empld();   // wrapper not allowed
    // String[][] generalInfo();   // two d array not allowed
    Shift shift() default Shift.DAY;
    // Employee onDuty();         // object type not allowed
    BookData bookData() default @BookData(bookName = "Effective Java");
}

@interface Review {
    int grade();
    public abstract int rating() default 4;
    // protected Reviewer reviewer(); // DOES NOT COMPILE
    // private String comment(); // DOES NOT COMPILE
    // final boolean accept(); // DOES NOT COMPILE
}


@interface Vehicle {
    String name() default "Vehicle";
    String value() default "Petrol";
    int id() default 0;
}

abstract class Truck {
    @Vehicle("Diesel")
    public void move() {
    }
    @Vehicle(value = "Diesel")
    public abstract int trip();
    @Vehicle
    String parts[];
}

@interface Music {
    String[] genres();
}
class Employee1 {
    // @Music(genres="Blues","Jazz") String favorite; // DOES NOT COMPILE
    // @Music(genres=) String mostDisliked; // DOES NOT COMPILE
    // @Music(genres = null) String other; // DOES NOT COMPILE
    @Music(genres = {}) String alternate;
}

@interface Rhythm {
    String[] value();
}

class Capybara {
    @Rhythm(value = { "Swing" })
    String favorite;
    @Rhythm(value = "R&B")
    String secondFavorite;
    @Rhythm({ "Classical" })
    String mostDisliked;
    @Rhythm("Country")
    String lastDisliked;
}