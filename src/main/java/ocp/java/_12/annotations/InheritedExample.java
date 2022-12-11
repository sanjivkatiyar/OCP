package ocp.java._12.annotations;

// 1. Apply directly
// 2. Apply via inheritance

@interface BreatheInWater{}
//@Inherited @interface BreatheInWater{}

@BreatheInWater class Fish{}

class Trout extends Fish{}

public class InheritedExample {

}
