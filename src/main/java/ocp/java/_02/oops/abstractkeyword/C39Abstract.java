package ocp.java._02.oops.abstractkeyword;

// Abstract methods are meant to be overridden in the subclass.
// Abstract methods describe a behavior but do not implement it.
// So the subclasses have to override it to actually implement the behavior.
// A subclass may chose not to override it, in which case, the subclass will have to be abstract too.
// native method cannot be abstract.
// return type should always be on the immediate left of method name.
// private method cannot be abstract. A private method is not inherited so how can a subclass implement it?
// abstract method in a abstract class must be declared abstract
public class C39Abstract {
    public static void main(String[] args) {
        // Pen pen = new Pen();            // can not use "new" as Pen is abstract
        Pencil pencil = new DrawingPencil();
        pencil.write();
        // pencil.erage();                 // pencil reference can only access methods of DrawingPencil
                                           // if defined in Pencil class.
        DrawingPencil dp = (DrawingPencil) pencil;
        dp.erage();                        // can do cast to get access
    }
}

abstract class Pen {}                      // no abstract method

// class Pencil{                           // a class with abstract methods must be abstract
abstract class Pencil{
    // abstract void write(){}             // no brackets
    abstract void write();
}

class DrawingPencil extends Pencil{
    @Override
    void write(){}
    void erage(){}
}