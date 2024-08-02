package java8;

// Source: https://gpcoder.com/4062-date-time-trong-java-8/

// The Date Time API in Java 8 implements methods according to the JSR-310 standard.
// It is designed to fix all the flaws in previous Date Time implementations.
// 1. Immutability
// 2. Separation of ConcernIt defines distinct classes for Date, Time, DateTime, Timestamp, Timezone, ...
// 3. Clarity
// 4. Utility operations
// 5. Extendable

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime_API {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        System.out.println("localDate: "+ localDate);
        System.out.println("localTime: "+ localTime);
        System.out.println("localDateTime: "+ localDateTime);
        System.out.println("zoneDateTime: "+ zoneDateTime);

        localDate = localDate.minusDays(1);
        System.out.println("localDate after minus: "+ localDate);

        localDate = localDate.plusDays(2);
        System.out.println("localDate after plus: "+ localDate);

        LocalDate spec = LocalDate.of(2017, 11, 25);
        System.out.println("spec: " + spec);
        long days = ChronoUnit.DAYS.between(localDate, spec);
        System.out.println("duration between localDate and spec is: " + days + "days");
    }
}
