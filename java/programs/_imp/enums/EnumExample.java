package programs._imp.enums;

//enum is a special class in Java that represents a group of constants (unchangeable variables, like final variables).
// It’s commonly used when you have a fixed set of related constants.

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Switch case using enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the workweek!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day");
        }

        // Looping through enum values
        System.out.println("\nList of all days in the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
