package ocp.java._04.arraysandcollections;

import java.time.*;

public class C65Period {
    public static void main(String[] args) {
        System.out.println(Period.of(1,2,3));                   // P1Y2M3D
        System.out.println(Period.of(1,22,233));   // ok        // P1Y22M233D

        LocalDate localDate = LocalDate.of(2021, Month.AUGUST, 1);
        // LocalTime localTime = LocalTime.of(999,999); // not okay
        LocalTime localTime = LocalTime.of(11,35);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        Period sevenDays = Period.ofDays(7);

        System.out.println(localDate.plus(sevenDays));                             // 2021-08-08
        System.out.println(localDate);          // 2021-08-01      // original value, remember the class is immutable
        System.out.println(localDateTime.plus(sevenDays));   // 2021-08-08T11:35
        System.out.println(localDateTime.minus(sevenDays));  // 2021-07-25T11:35

    }
}
