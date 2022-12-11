package ocp.java._10.streamsandlambda.streams;


import java.util.Arrays;
import java.util.List;
/*
140.0
140.0
100.0
30.9
102.9
102.9
33.0
Numbers of temps > 100 is: 2
 */
public class PipelineDemo {
    public static void main(String[] args) {

        List<Double> temps = Arrays.asList(140.0, 100.0, 30.9, 102.9, 33.0);
        System.out.println("Numbers of temps > 100 is: "+
                temps
                        .stream()
                        .peek(System.out::println)
                        .filter(temp -> temp>100)
                        .peek(System.out::println)
                        .count());
    }
}
