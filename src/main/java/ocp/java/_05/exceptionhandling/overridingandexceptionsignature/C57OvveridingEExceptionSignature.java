package ocp.java._05.exceptionhandling.overridingandexceptionsignature;

import java.io.IOException;

public class C57OvveridingEExceptionSignature {
}

class Base{
    void m() throws IOException {
        System.out.println("Base::m()");
    }
}

class Sub extends Base{
    @Override
    // void m(){}; // OK, none is valid sub-set
    // void m() throws IOException{} // OK, exact same Exception signature
    // void m() throws NullPointerException{} // OK, can throw any Runtime Exception
    // void m() throws EOFException {} // OK, sub type
    // void m() throws Exception{} // not ok, super type
    // void m() throws ClassNotFoundException{} // not okay, trying to throw checked of sibling type
    void m() {
        System.out.println("Base::m()");
    }

}