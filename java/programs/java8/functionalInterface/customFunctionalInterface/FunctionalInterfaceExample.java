package java8.functionalInterface.customFunctionalInterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
        greeting.greet("Alice");
    }
}
