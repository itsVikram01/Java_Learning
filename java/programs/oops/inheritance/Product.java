package oops.inheritance;

public class Product {
    private final String name = "abc";
    private final double price = 100D;
    // Getters and Setters for name and price

    public void displayDetails() {
        System.out.println("Name: " + name + ", Price: $" + price);
    }
}
