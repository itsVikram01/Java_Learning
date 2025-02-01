package programs.java8.optionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a value
        String name = "Alice";
        Optional<String> optionalName = Optional.of(name);

        // Creating an Optional with a nullable value
        String maybeNull = null;
        Optional<String> optionalMaybeNull = Optional.ofNullable(maybeNull);

        // Creating an empty Optional
        Optional<String> emptyOptional = Optional.empty();

        // Checking if a value is present
        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get());
        }

        // Handling empty Optional
        String defaultValue = "Unknown";
        String result = optionalMaybeNull.orElse(defaultValue);
        System.out.println("Result: " + result);

        // Using ifPresent()
        optionalName.ifPresent(System.out::println);
    }
}