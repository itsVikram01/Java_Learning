package programs.java17.sealedClassesAndInterfaces;

sealed interface Shapes permits Circles, Rectangles {
    String describe();
}

final class Circles implements Shapes {
    double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    @Override
    public String describe() {
        return "This is a Circle with radius: " + radius;
    }
}

final class Rectangles implements Shapes {
    private final double length;
    private final double width;

    public Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String describe() {
        return "This is a Rectangle with length: " + length + " and width: " + width;
    }
}

public class SealedShapeInterfaceExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println(circle.describe());
        System.out.println(rectangle.describe());
    }
}