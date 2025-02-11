// Q6- Using java 8 date/time api: 1. WAP to get two dates from user and print if the first date occurs before or after the second date supplied by the user. 2. WAP to print current date and time in 3 different time zones.

import java.time.*; // It is the main API for dates, times, instants, and durations.
import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get two dates from the user
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        // Print current date and time in 3 different time zones
        System.out.println("\nCurrent Date & Time in Different Time Zones: ");
        System.out.println("India: " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("US (New York): " + ZonedDateTime.now(ZoneId.of("America/New_York")));
        System.out.println("UK (London): " + ZonedDateTime.now(ZoneId.of("Europe/London")));
        sc.close();
    }
}

