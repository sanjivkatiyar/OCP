package ocp.java.mock.test2;

public class Q19 {
}

/*

Bottom Up Approach for modularizing an application  While modularizing an app using the bottom-up approach,
you basically need to convert lower level libraries into modular jars before you can convert the higher level libraries.
For example, if a class in A.jar directly uses a class from B.jar, and a class in B.jar directly uses a class
from C.jar, you need to first modularize C.jar and then B.jar before you can modularize A.jar.
Thus, bottom up approach is possible only when the dependent libraries are modularized already.
 */