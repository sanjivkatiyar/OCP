package com.ocp.java._02.oops.constructors;

class Test {

        //private static final int empId;  // static final need initialization on declaring
        private final int empId;
        private final String name = "Mike";
        {
            empId = 10;
        }



    public Test(int a){

    }
}

class Jest extends Test{

    public Jest(int a) {
        super(a);
    }

    Jest jest = new Jest(1);
}