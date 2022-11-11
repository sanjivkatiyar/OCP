package com.ocp.java._12.annotations;

// Example - "value" element for shorthand
@interface Team{
    // "value" element is the key!
    String value() default "Soccer";            // required or optional is fine
    int numPlayers() default 2;                 // must be optional if we wish to use shorthand i.e. "value"
}

class Sport {
    @Team(numPlayers=6, value="Volleyball") void beach(){}; // all provided
    @Team(value = "Tennis") void strawberriesAndCream(){};  // numPlayer omitted

    // Where shorthand is used (as in below), then there must be a "value" element.
    @Team("Curling") void show(){};             // numPlayers omitted AND "value=" omitted
                                                // same as: value="Curling"
}
// Example - shorthand for arrays with only one element
@interface Quiz{
    String[] topics();
}

class competitor{
    @Quiz(topics = {"English","Math","History"}) String favouriteTopics;
    @Quiz(topics = {"Sport"}) String leastFavouriteTopics;
    @Quiz(topics = "Sport") String leastOtherFavouriteTopics;

    // These do not compile
    // @Quiz("Sport") String leastOtherOtherFavouriteTopics;     // looking for method/element value with is not present
    // @Quiz(topics = "English","Math","History") String favouriteTopics; - {} missing
    // @Quiz(topics=null) String topic;                          // constant expression required
    @Quiz(topics={}) String topic;                               // {} is ok

}

// Example - Combining both shorthands
//      - value()
//      - array with only one element

@interface Colours {
    String[] value();                                          // value element and an array
}

class TestRainbow{
    @Colours(value={"Red","Blue"}) String color1;
    @Colours({"Red","Blue"}) String color2;
    @Colours(value="Red") String color6;
    @Colours(value={"Red"}) String color5;
    @Colours({"Red"}) String color3;
    @Colours("Red") String color4;

}

@interface IntTest{
    int value();
}

@IntTest(2) class XX{}

public class ShortHand {
}
