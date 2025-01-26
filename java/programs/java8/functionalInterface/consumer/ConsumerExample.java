package java8.functionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> System.out.println("Hello,  " + name + "!");
        consumer.accept("Alice");

        // Using andThen()
        Consumer<String> consumer1 = name -> System.out.println("Processing: " + name);
        Consumer<String> consumer2 = name -> System.out.println("Done processing: " + name);
        consumer1.andThen(consumer2).accept("Bob");
    }
}