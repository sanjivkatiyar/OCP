package ocp.java._02.oops;

// public < protected < package (i.e. no modifier) < private
// private, protected and public can be applied to a nested class.
// Although not too important for the exam, you should still know the following terminology:
// A top level class is a class that is not a nested class.
// A nested class is any class whose declaration occurs within the body of another class or interface.
// synchronized keyword can never be applied to a class.
// It can only be applied to a method or a block.
public class C26AccessModifiers {
    public static void main(String[] args) {
        Adult john = new Adult("John", 22);
        john.setName("JJ");;
        john.badPractice = "BadPractice";
        //john.age = 10; // not ok
        System.out.println("Is 17 ok? "+john.isAgeOk(17));
        System.out.println("BadPractice "+john.badPractice);
    }
}

