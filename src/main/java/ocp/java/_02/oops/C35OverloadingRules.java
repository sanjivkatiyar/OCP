package ocp.java._02.oops;

import java.io.IOException;

// Only the methods that are not declared to be final can be overridden.
// Further, private methods are not inherited so they cannot be overridden either.

// The overriding method may opt not to declare any throws clause
// even if the original method has a throws clause.
public class C35OverloadingRules {
}

class Math{
    public void method(int i, String s, float f){}
    public void method(int i, String s){}
    private int method(int i, float f){return 1;}
    public void method(float f, String s) throws IOException{}
}