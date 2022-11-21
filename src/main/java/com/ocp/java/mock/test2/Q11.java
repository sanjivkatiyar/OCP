package com.ocp.java.mock.test2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.Function;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface NonNull {
}

public class Q11 {

    @NonNull String str = "";

    // var str = @NonNull "";                   // Annotation not allowed here


    // Function<Integer, String> f = (Integer @NonNull val ) -> Integer.toHexString(val);
    // Placement of @NonNull is incorrect. It should be (@NonNull Integer val).

    Function<Integer, String> f = (@NonNull Integer val ) -> Integer.toHexString(val);


    // Function<Integer, String> f1 = ( var @NonNull val ) -> Integer.toHexString(val);
    // Placement of @NonNull is incorrect. It should be (@NonNull var val).

    // Function<Integer, String> f1 = ( @NonNull var  val ) -> Integer.toHexString(val);

    // Function<Integer, String> f2 = ( @NonNull val ) -> Integer.toHexString(val);
    // While using applying annotation to lambda parameter, the type of the parameter must also be present.
    // Therefore, it needs to be changed to:
    // Function<Integer, String> f = ( @NonNull var val ) -> Integer.toHexString(val);
    // or Function<Integer, String> f = ( @NonNull Integer val ) -> Integer.toHexString(val);


    public static void main(String[] args) {


    }
}
