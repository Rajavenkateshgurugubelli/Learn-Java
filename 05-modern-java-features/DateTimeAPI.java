package modern;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Module 05: Modern Java
 * Topic: Date and Time API (java.time)
 * 
 * Objectives:
 * 1. LocalDate, LocalTime, LocalDateTime (Machine independent).
 * 2. ZonedDateTime (Timezone aware).
 * 3. Formatting and Parsing.
 * 4. Calculating duration/period.
 */
public class DateTimeAPI {

    public static void main(String[] args) {

        // --- Current Date/Time ---
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime currentDT = LocalDateTime.now();

        System.out.println("Date: " + today);
        System.out.println("Time: " + now); // Includes nanos

        // --- Creating Specific Instances ---
        LocalDate independenceDay = LocalDate.of(1776, 7, 4);
        System.out.println("US Independence: " + independenceDay);

        // --- Manipulation (Immutable!) ---
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next Week: " + nextWeek);

        // --- Formatting ---
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatted = currentDT.format(formatter);
        System.out.println("Formatted: " + formatted);

        // --- Timezones ---
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Paris Time: " + zdt);

        // --- Comparison ---
        boolean isBefore = independenceDay.isBefore(today);
        System.out.println("Was 1776 before today? " + isBefore);
    }
}
