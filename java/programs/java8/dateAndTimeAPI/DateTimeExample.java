package java8.dateAndTimeAPI;

import java.time.*;

public class DateTimeExample {
    public static void main(String[] args) {
        // Get current date, time, and date-time
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Create specific date and time
        LocalDate birthday = LocalDate.of(1990, 1, 15);
        LocalTime wakeUpTime = LocalTime.of(7, 30);

        // Get date and time in a specific time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Formatting
        String formattedDate = today.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String formattedTime = now.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("today : " + today);
        System.out.println("now : " + now);
        System.out.println("currentDateTime : " + currentDateTime);
        System.out.println("birthday : " + birthday);
        System.out.println("wakeUpTime : " + wakeUpTime);
        System.out.println("zonedDateTime : " + zonedDateTime);
        System.out.println("formattedDate : " + formattedDate);
        System.out.println("formattedTime : " + formattedTime);

        // DateTimeCalculations
        /*LocalDate birthdate = LocalDate.of(1990, 1, 15);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthdate, today);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");*/

    }
}

