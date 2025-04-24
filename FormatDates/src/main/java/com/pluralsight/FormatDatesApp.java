package com.pluralsight;

import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class FormatDatesApp {

    public static void main(String[] args) {

        // importing LocalTime to get current time
        // importing LocalTDate to get current date
        // importing LocalTime and LocalDate to get current time/date
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateAndTime = LocalDateTime.now();

        // printing out format: 2025-04-24
        System.out.println("----------------------------------------------");
        System.out.println("Current date: " + currentDate + "\n");

        // printing out Format 1: 04/24/2025
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Format 1: " + currentDateAndTime.format(formatter1));

        // printing out Format 2: 2025-04-24
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Format 2: " + currentDateAndTime.format(formatter2));

        // printing out Format 3: April 24, 2025
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println("Format 3: " + currentDateAndTime.format(formatter3));

        // printing out format 4, Thursday, Apr 24, 2025  10:32
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy  HH:mm");
        // printing out current day of the week/month/date/year/time
        System.out.println("Format 4: " + currentDateAndTime.format(formatter4));


        ZonedDateTime gmtTimeZone = ZonedDateTime.now(ZoneId.of("GMT"));
        // reformatting to: full name of day of week / month / day / year / hour
        DateTimeFormatter gmtFormat = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy  HH:mm");
        System.out.println("GMT Format: " + gmtTimeZone.toLocalTime(gmtFormat));

        // String formatter5 = "HH:mm  EEEE, MMM, d, yyyy  ";
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm 'on' d-MMM-yyyy");
        // printing out Format 5: 10:49 on 24-Apr-2025
        System.out.println("Challenge - Format 5: " + currentDateAndTime.format(formatter5));

    }
}