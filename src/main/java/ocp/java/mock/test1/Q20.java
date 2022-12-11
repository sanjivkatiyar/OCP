package ocp.java.mock.test1;

public class Q20 {

    /*
    Here are a few things that you must remember about modules -
    1. A module can export only packages (not individual types(classes/interfaces/enums).
    All public types of exported packages can be accessed by other modules.

    2. To export a package, a module must write an exports clause for that package in its module-info.java
    For example, in the following module-info.java,
    module com.foo.bar exports com.foo.bar.alpha package to others.
    This means other modules can access all public types of com.foo.bar.alpha package.
    module com.foo.bar { \exports com.foo.bar.alpha; }
    3. To access another module's exported packages,
    a module must specify that it requires the other module using the requires clause.
    For example, in the following module-info.java, module com.foo.app specifies
    that it requires module com.foo.bar.
    It can therefore access all public types of all the packages
    that are exported by module com.foo.bar.  module com.foo.app {requires com.foo.bar; }
     */
}
