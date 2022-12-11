package ocp.java._12.annotations;

// SOURCE - Source file only, compiler discards it
// CLASS - Stored in the class file but not available  at runtime. this is the default compiler behaviour
// RUNTIME - Store in the .class and available at runtime (via reflection)

// What is reflection???

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@interface Mouse{}

@Retention(RetentionPolicy.RUNTIME)
@interface Keyboard{}

@Mouse class DellMouse{}

public class RetentionExample {
}

