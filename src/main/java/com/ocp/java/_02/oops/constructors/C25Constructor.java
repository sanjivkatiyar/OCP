package com.ocp.java._02.oops.constructors;

// A constructor can be declared private.
// A constructor can access the non-static members of a class.
// A default no args one will be provided if not defined any.
// All non-final instance variables get default values if not explicitly initialized.
// A constructor is non-static,
// and so it can access directly both the static and non-static members of the class.
// Constructor has not return type
// construction can not be inheritted so no need to make it final (can not be final)
// Constructor becomes a valid method if return type is specified
public class C25Constructor {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Mouse m = new Mouse();
        Mouse m1 = new Mouse("Nibbles");
    }
}

class Dog{
    // will get a default constructor like below
    /*Dog(){
        super();
    }*/
}

class Cat{
    Cat(){}
}

class Mouse{
    private String theName;
    Mouse(){
        theName="";
    }
    Mouse(String aName){
        theName= aName;
    }
    void Mouse(){} // this is not a constructor but a badly written method
}

class Clothing{
    Clothing(String type){}
}

// class Shirt extends Clothing{
    // the problem is that the compiler inserts:
    // Shirt(){
    //    super();
    // }
    // but there is no no-arg constructor in clothing
//}


class Computer {
    int price;
    Computer (int price){
        this.price = price;
    }
}
// The access type of a default constructor is same as the access type of the class.
// Thus, if a class is public, the default constructor will be public.
// A constructor does not return any value at all. It is meant to initialize the state of an object.
/* will not compile as not default constructor present in super
class laptop extends Computer{

}*/

//  this is used to call same class constructor
// this or super must be first line
// either of them can be called.
class Tablet extends Computer{
    Tablet(int i){
        super(i);
    }

    Tablet(){
        this(6);
    }

}
//  In Java fields are initialized before the constructor.