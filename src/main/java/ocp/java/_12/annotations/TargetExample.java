package ocp.java._12.annotations;

// While java.lang is automatically imported java.lang.annotation is not
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.CONSTRUCTOR})
//@Target({ElementType.FIELD, ElementType.PARAMETER})
//@Target(ElementType.TYPE)               // if we un-comment line 8 & 9 compiler will show error on line 9 for duplicate
@interface DataItem{}

@DataItem class X{}
@DataItem interface Y{}

class Z{
    @DataItem int a;
    @DataItem static int b;
    @DataItem Z(){};
    void m1(@DataItem int a){}
}

@Target(ElementType.TYPE_USE)
@interface WildCard{}

@WildCard class X1{
    @WildCard int x;
    @WildCard static int y;

    @WildCard int m1(@WildCard int a){
        @WildCard int z = 0;
        var x1 = new @WildCard X1();
        int n = (@WildCard int)23.9;
        return 1;
    }

    // @WildCard void X2(){}                   // void can not be annotated
}

public class TargetExample {
}
