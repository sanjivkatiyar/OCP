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
    public void testDeprecated(){
        Book.print();
    }

//    @SuppressWarnings("unchecked")          // ignore warning relating to use of "raw type"
    public void testUnchecked(){
        Book.preview(new ArrayList<>());
        //Book.preview(new ArrayList());      // This is a raw type "new ArrayList<String>()" would be better
    }

    @SafeVarargs
    static int abuseVarargs(List<Integer>... list){ // must have varargs and be private, static or final
        Object[] oa = list;
        oa[0] = Arrays.asList("uh-oh!");
        return list[0].get(0);               // ClassCastException : String to Integer
    }
}



