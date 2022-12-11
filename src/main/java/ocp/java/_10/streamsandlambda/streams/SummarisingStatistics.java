package ocp.java._10.streamsandlambda.streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummarisingStatistics {

    public static void main(String[] args) {

        stats(IntStream.of(5,10,15,20));
        stats(IntStream.empty());

    }

    public static void stats(IntStream numbers){

        IntSummaryStatistics intSummaryStatistics = numbers.summaryStatistics();    // terminal op
        System.out.println(intSummaryStatistics.getMin());         // 2147483647 if nothing in stream
        System.out.println(intSummaryStatistics.getMax());         // -2147483648 if nothing in stream
        System.out.println(intSummaryStatistics.getAverage());     // 0.0 if nothing in stream
        System.out.println(intSummaryStatistics.getCount());       // 0 if nothing in stream
        System.out.println(intSummaryStatistics.getSum());         // 0 if nothing in stream
    }
}
