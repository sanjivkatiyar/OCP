package ocp._25.Generics;


public class Test {

    public static void main(String[] args) {



    }
}

/*

Compile-time type checking is done

Casting is eliminated

Can implement Generic algorithms


We already know that child objects are compatible with their parent types.
Adding this kind of assignment to generic components is termed as Inheritance with Generics.

Record<Object> objectRecord = new Record<Object>();
objectRecord.add(new Student("Mark Smith"));    // Allowed

However, a Record<Student> Object cannot be assigned to a Record<Object> reference
Record<Object> objectRecord = new Record<Student>();    // Compilation error

Generics also have certain restrictions:

We should not create an instance for the type parameter.

E e = new E();    // Compilation error
java.lang.Throwable class cannot be extended by the Generic class.

A generic type with primitive type cannot be used. It must always be used with a reference type
 */