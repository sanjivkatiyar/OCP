package com.ocp.java._12.annotations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. With no annotations.
// 2. Deprecate "print()"
//      a) show cmdline compiler error
//      b) uncomment @SuppressWarnings("deprecation") - error should disappear but does not
// 3. Uncomment "unchecked()" method.
//      a) show commandline warning
//      b) uncomment @SuppressWarnings("unchecked") - warning gone
// 4. @SafeVarargs
//      a) The rules around public/static/final varargs
//      b) uncomment "abuseVarargs()" method and its method call
//          1. do it first without @SafeVarargs and observe the compiler warning
//          2. insert @SafeVarargs and ond note the error go away
// 5. The no-args constructor of Child invokes the no-args constructor of Parent.
// If the no-args constructor of Parent is deprecated, while creating new instance of child the compiler will generate a warning.
//



class Book{
    /**
     * How to consume this book
     * @deprecated Use readOnline instead.
     */
    @Deprecated(since="2.0", forRemoval = true)
    public static void print(){}
    public static void readOnline(){}
    public static Integer preview(List<String> pages){return pages.size();}
}



public class CommonBuiltInAnnotationsExtra {

    public static void main(String[] args) {
        CommonBuiltInAnnotationsExtra ann = new CommonBuiltInAnnotationsExtra();
        ann.testDeprecated();
        ann.testUnchecked();

        abuseVarargs(new ArrayList<>());
    }

//    @SuppressWarnings("deprecation")
//    @SuppressWarnings({"deprication", "rawtypes"})     - ok
//    @SuppressWarnings("deprication", "rawtypes")       - not okay
    public void testDeprecated(){
        //Book.print();
    }

//    @SuppressWarnings("unchecked")          // ignore warning relating to use of "raw type"
    public void testUnchecked(){
        Book.preview(new ArrayList<>());
        //Book.preview(new ArrayList());      // This is a raw type "new ArrayList<String>()" would be better
    }

    //Any time you invoke a method "OR" declare a method that uses varargs with a generic type,
    // you will get an "unchecked" warning

    //@SafeVarargs
    //@SuppressWarnings("unchecked")
    static int abuseVarargs(List<Integer>... list){ // must have varargs and be private, static or final
        Object[] oa = list;
        oa[0] = Arrays.asList("uh-oh!");
        return list[0].get(0);               // ClassCastException : String to Integer
    }
}



