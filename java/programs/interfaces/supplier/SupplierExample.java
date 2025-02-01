package programs.interfaces.supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier to generate random numbers
        Supplier<Double> randomSupplier = () -> Math.random();

        // Supplier to create a new ArrayList
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;

        System.out.println("Random number: " + randomSupplier.get());
        System.out.println("Empty list: " + listSupplier.get());
    }
}