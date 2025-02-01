package programs.java8.functionalInterface.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier to generate random numbers
        Supplier<Double> randomSupplier = Math::random;
        double randomNumber = randomSupplier.get();
        System.out.println("Random number: " + randomNumber);

        // Supplier to create a new String
        Supplier<String> greetingSupplier = () -> "Hello, World!";
        String greeting = greetingSupplier.get();
        System.out.println(greeting);
    }
}
