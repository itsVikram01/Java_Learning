package programs.designPattern._solidDesignPrinciple.openClosedPrinciple;

// Bad Example (violates OCP)
/*class ShapeCalculator {
    public double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            return Math.PI * shape.getRadius() * shape.getRadius();
        } else if (shape instanceof Rectangle) {
            return shape.getWidth() * shape.getHeight();
        }
        // ... more shape checks ...
    }
}*/

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class ShapeCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class OCPExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        ShapeCalculator calculator = new ShapeCalculator();
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
    }
}
