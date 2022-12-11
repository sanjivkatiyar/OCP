package ocp.java._02.oops.protected1.sub;

import ocp.java._02.oops.protected1.Super;

public class Sub extends Super {
    public static void main(String[] args) {
        Super super1 = new Super();
        super1.superMethod();
        // super1.superProtectedMethod(); can not access protected method
        // via reference as it already has access via inheritance


    }


    @Override
    protected void superProtectedMethod(){

    }

    // @Override                    // can not override default method in different package
    void superDefaultMethod(){
        System.out.println("Super Default Method");
    }
}
