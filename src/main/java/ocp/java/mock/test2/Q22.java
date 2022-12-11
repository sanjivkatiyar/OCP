package ocp.java.mock.test2;

class BaseClass{
    public void print(String s) {  System.out.println("BaseClass :"+s); }
}
class SubClass extends BaseClass{
    public void print(String s){
        System.out.println("SubClass :"+s);
        // Line 1

        super.print(s); // calling overriden method in super class
    }
    public static void main(String args[]){
        SubClass sc = new SubClass();
        sc.print("location");
        // super.print(s)  // can noo be used from static context
    }
}