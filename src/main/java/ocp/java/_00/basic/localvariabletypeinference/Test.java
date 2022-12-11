package ocp.java._00.basic.localvariabletypeinference;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        var mylist = new ArrayList<>();

        System.out.println(mylist.getClass());
    }
}
