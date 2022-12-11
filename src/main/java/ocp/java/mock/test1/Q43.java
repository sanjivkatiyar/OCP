package ocp.java.mock.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

public class Q43 {
}

class Base {
    public <T> Collection<T> transform(Collection<T> list) {
        return new ArrayList<>();
    }
}

class Derived extends Base {

//    public <T> Collection<T> transform(Collection<T> list) {
//        return new HashSet<>();
//    }

     //1 HashSet<String> cannot be converted to Collection<T>

    public <T> Collection<T> transform(Stream<T> list) {
        return new HashSet<T>();
    }

     //2 Since the parameter doesn't match with the Base class's method,
    // it is not an override but a valid overload.

//    public <T> List<T> transform(Collection<T> list) {
//        return new ArrayList<T>();
//    }

     //3 correctly overrides the method in Base

//    public <X> Collection<X> transform(Collection<X> list) {
//        return new HashSet<X>();
//    }

     //4 It is actually a valid override.

//    public Collection<CharSequence> transform(Collection<CharSequence> list) {
//        return new HashSet<CharSequence>();
//    }

     //5 Remember that generic type information is removed at runtime.
    // So, at runtime the method at
    // 5 actually looks like public Collection transform(Collection list),
    // which is exactly the same as how the method in the base class will look like at runtime to the JVM.
    // Thus, this should be a valid override. However, to the compiler,
    // the two methods have different signatures (but same name) and constitute a valid overload.
    // This contradiction is not acceptable and is actually prohibited by the
    // Java language and so //5 doesn't compile.
    // is neither considered a valid overload nor a valid override.
}