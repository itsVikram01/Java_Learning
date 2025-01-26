package java17.sealedClassesAndInterfaces;

// Sealed classes restrict which other classes or interfaces can extend or implement them.
sealed class Shape permits Circle, Rectangle {
    public String describe() {
        return "This is a shape.";
    }
}

final class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String describe() {
        return "This is a Circle with radius: " + radius;
    }
}

final class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String describe() {
        return "This is a Rectangle with length: " + length + " and width: " + width;
    }
}

public class SealedClassShapeExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println(circle.describe());
        System.out.println(rectangle.describe());
    }
}
