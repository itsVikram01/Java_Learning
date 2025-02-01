package programs.oops.abstraction.usingAbstractClass;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5); // Object creation Of Circle class using Circle class refernce
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
