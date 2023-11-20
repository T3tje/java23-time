package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        // Specify the future date using a LocalDate object
        LocalDate futureDate = LocalDate.of(2023, 8, 5);

        // Combine the future date with a default time (midnight) to create a LocalDateTime object
        LocalDateTime futureDateTime = futureDate.atStartOfDay();

        // Compare the dates and times
        if (localDateTime.isBefore(futureDateTime)) {
            System.out.println("The current date and time is before the specified future date and time.");
        } else if (localDateTime.isAfter(futureDateTime)) {
            System.out.println("The current date and time is after the specified future date and time.");
        } else {
            System.out.println("The current date and time is the same as the specified future date and time.");
        }

        LocalDateTime ldt1 = LocalDateTime.of(2021, 1, 1, 0, 0 ,0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2023, 1, 1, 0, 0 ,0, 0);
        long days = ChronoUnit.DAYS.between(ldt1, ldt2);
        long months = ChronoUnit.MONTHS.between(ldt1, ldt2);
        System.out.println("Days between: " + days);
        System.out.println("Months betweeen: " +months);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm.ss ZZZZ");
        System.out.println(formatTime.format(zonedDateTime));

        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter formatTimeLocal = DateTimeFormatter.ofPattern("dd.MM.yy hh:mm");
        System.out.println(formatTimeLocal.format(localDateTime1));

        ZonedDa
    }
}