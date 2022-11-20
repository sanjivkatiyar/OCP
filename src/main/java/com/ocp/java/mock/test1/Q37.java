package com.ocp.java.mock.test1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q37 {
}

class PortConnector {
    public PortConnector(int port) throws IOException {
    }
}

// A constructor is free to throw any exception.

// It is possible. You can also throw a superclass of IOException from the CleanConnector's constructor.
// For example, the following is valid:
class CleanConnector extends PortConnector {
    public CleanConnector(int port) throws Exception {
        super(port);
    }
}

// It can throw any exception but it must also declare that it throws IOException (or its super class).
// So the following is valid:
class CleanConnector1 extends PortConnector {
    public CleanConnector1(int port) throws IOException, FileNotFoundException {
        super(port);
    }
}

// Observe that the rule for overriding a method is opposite to the rule for constructors.
// An overriding method cannot throw a superclass exception,
// while a constructor of a subclass cannot throw subclass exception
// (Assuming that the same exception or its super class is not present in the subclass constructor's throws clause).