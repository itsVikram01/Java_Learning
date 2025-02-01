package programs.java8.optionalClass;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<Integer> maybeNumber = Optional.ofNullable(null);

        // Using orElseGet to avoid potential NullPointerException
        int value = maybeNumber.orElseGet(() -> calculateDefaultValue());
        System.out.println(value);

        // Using map to transform the value
        Optional<String> maybeString = maybeNumber.map(String::valueOf);
        maybeString.ifPresent(System.out::println);
    }

    private static int calculateDefaultValue() {
        // Simulate expensive calculation
        System.out.println("Calculating default value...");
        return 42;
    }
}