package com.ocp.java._03.controllingprogramflow.enhancedforloops;

import java.util.ArrayList;
import java.util.List;
// You cannot find out the number of the current iteration while iterating.
public class C20ForEach {
    public static void main(String[] args) {
        String[] cars = new String[3];
        // cars[0] = "Fiat";
        cars[1] = "Volvo";
        cars[2] = "Tesla";

        // traditional  for loop
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);    // null, volvo, tesla
        }

        // enhanced for loop
        for(String car:cars){
            System.out.println(car);
        }

        for(String car:cars){       // var is ok
            System.out.println(car);
        }


        List<String> trucks = new ArrayList<>();
        trucks.add("Ram");
        trucks.add("Ford");
        trucks.add("Toyota");

        for(String truck:trucks){
            System.out.println(truck);
        }


        String[] countries = new String[3];
        countries[0] = "Ireland";
        countries[1] = "United States";
        countries[2] = "Canada";

        // for(int country: countries) {} // country should be string

        String name = "";
        // for(String name: countries){} // name already declared

        String player = "Federar";
        // for(String p: player) {} array or iterable on RHS

        long[] la = {8L, 9L, 10L};
        //for(int n:la) {} // n needs to be long

        int[] ia = {1,2,3};
        for (long l:ia){} // ok

        String[][] directions =
                {{"north", "south"}, {"east", "west"}};
        for(String[] row:directions){
            for(String direction:row){
                System.out.print(direction + "\t");
            }
        }
    }
}
