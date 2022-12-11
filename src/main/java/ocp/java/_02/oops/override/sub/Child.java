package ocp.java._02.oops.override.sub;

import ocp.java._02.oops.override.parent.Parent;

import java.util.Set;

public class Child extends Parent {

    // public void m (Set<CharSequence> cs) {}   // Same erasure as below
    @Override
    public void m(Set<CharSequence> cs) {
    }

//    @Override
//    public void m(Set<String> cs) {            // Not a valid override
//    }


    public static void main(String[] args) {

    }

}
