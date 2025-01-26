package oops.abstraction.usingAbstractClass;

public class Circle extends Shape { // cannot use protected/private access modifier with Child class(Concrete subclass)
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() { // concrete implementation of Parent abstract method calculateArea() by concrete subclass Circle
        return Math.PI * radius * radius;
    }
}
