package com.ocp.java._04.arraysandcollections;

import java.time.*;

public class C65Period {
    public static void main(String[] args) {
        System.out.println(Period.of(1,2,3));
        System.out.println(Period.of(1,22,233));   // ok

        LocalDate localDate = LocalDate.of(2021, Month.AUGUST, 1);
        // LocalTime localTime = LocalTime.of(999,999); // not okay
        LocalTime localTime = LocalTime.of(11,35);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        Period sevenDays = Period.ofDays(7);

        System.out.println(localDate.plus(sevenDays));
        System.out.println(localDate);                      // original value, remember the class is immutable
        System.out.println(localDateTime.plus(sevenDays));
        System.out.println(localDateTime.minus(sevenDays));

    }
}
