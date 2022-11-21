package com.ocp.java.mock.test2;

public class Q4 {}

/*

1. When a file is deserialized into an object, the class's constructor and instance initializers are not called.
So the fields for which no value is available in the serialized file, are initialized to their default values
(i.e. number fields to 0, boolean to false, and references to null).
Note that the fields of a non-serializable super class are initialized by the instance initializers and the no-args constructor of that super class.

2. serialVersionUID denotes the version number of the class.
If you don't specify serialVersionUID for a class that implements Serializable, Java compiler automatically adds this field.
It computes a value based on the attributes of the class such as the fields and interfaces, and assigns that value to serialVersionUID.
It is used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object
that are compatible with respect to serialization.
If the receiver has loaded a class for the object that has a different serialVersionUID than that of the corresponding sender's class,
then deserialization will result in an InvalidClassException.

3. If the serialVersionUID for the serialized object and the actual class is same then the deserialization completes successfully
but any additional fields that are not present in the serialized file are initialized to their default value (as per point 1. above).
Any fields that are missing in the class but are present in the serialized file are ignored.
 */