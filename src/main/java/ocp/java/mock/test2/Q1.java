package ocp.java.mock.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class AmazingClass {
    void amazingMethod(Collection c) {
        System.out.println("Got collection");
    }

    ;
}

public class Q1 extends AmazingClass {
    void amazingMethod(List l) {
        System.out.println("Got list");
    };

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        Collection<String> c = al;
        AmazingClass ac = new Q1();
        ac.amazingMethod(c);                      // Got collection

        Q1 q1 = new Q1();
        q1.amazingMethod(c);                      // Got collection
    }
}

/*

Observe that SpecialAmazingClass does not actually override amazingMethod(Collection c).
The parameter type of amazingMethod defined by SpecialAmazingClass is List.
Therefore, it is a case of overload and not of override. So, effectively, SpecialAmazingClass has two methods
- amazingMethod(Collection c) and amazingMethod(List l).
However, since the declared type of ac is AmazingClass, there is only one applicable method that can be invoked on ac,
which is amazingMethod(Collection c).
Even if ac were declared to be of type SpecialAmazingClass, amazingMethod(Collection c) would have been invoked
upon the call to amazingMethod(c).
Since the declared type of the argument c is Collection and not List, amazingMethod(Collection )
will be more specific than amazingMethod(List ) for the amazingMethod(c) call.

 */