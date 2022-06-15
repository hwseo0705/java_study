package day16.api.time;

import utility.Util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        // don't use these - not recommended
        // new Date();
        // Calendar cal = Calendar.getInstance(); // abstract class

        // get current date
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        
        // get current time
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);        
        
        // get current date & time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        // get a specific date & time
        LocalDateTime dateTime = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println("dateTime = " + dateTime);

        Util.line();

        // get year
        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        System.out.println("getMonth = " + localDateTime.getMonth()); // JUNE
        System.out.println("getMonthValue = " + localDateTime.getMonthValue()); // 6

        System.out.println("getDayOfYear = " + localDateTime.getDayOfYear()); // 166
        System.out.println("getDayOfMonth = " + localDateTime.getDayOfMonth()); // 15
        System.out.println("getDayOfWeek = " + localDateTime.getDayOfWeek()); // WEDNESDAY

        Util.line();

        // get 3 days from now
        System.out.println("plusDays(3) = " + localDateTime.plusDays(3)); // today + 3 days

        // 1 year, 2 months, and 7 days from now
        // -1 year = minusYears(1)
        System.out.println("plusYears(1).plusMonths(2).plusDays(7) = " +
                localDateTime.plusYears(1).plusMonths(2).plusDays(7));

        LocalDate a = LocalDate.of(2020, 12, 30);
        LocalDate b = LocalDate.of(2022, 9, 14);
        long between = ChronoUnit.DAYS.between(a, b); ///////////////// ChronoUnit.DAYS.between(a, b) /////////////////
        System.out.println("between = " + between);

        Util.line();
        // format date
        System.out.println(localDateTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 m분 E요일");
        System.out.println(localDateTime.format(dtf));
    }
}

