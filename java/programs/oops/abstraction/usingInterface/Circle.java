package oops.abstraction.usingInterface;

interface Shape {
    static double calculateTotalArea(Shape[] shapes) { // Static method - can be called directly using interface name
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    double calculateArea(); // Abstract method - needs implementation in implementing class

    default void printInfo() { // Default method with implementation
        System.out.println("This is a shape object.");
    }
}

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Can override the default method if needed
    @Override
    public void printInfo() {
        System.out.println("This is a circle object with radius: " + radius);
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);

        System.out.println("Circle 1 Area: " + circle1.calculateArea()); // Calling abstract method through object

        circle1.printInfo(); // Calling default method through object (can be overridden)

        System.out.println("Total Area of both circles: " + Shape.calculateTotalArea(new Shape[]{circle1, circle2})); // Calling static method directly using interface name
    }
}
