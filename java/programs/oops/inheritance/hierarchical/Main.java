package programs.oops.inheritance.hierarchical;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();  // Inherited from Shape
        c.roll();  // Specific to Circle

        Rectangle r = new Rectangle();
        r.draw();  // Inherited from Shape
        r.calculateArea(); // Specific to Rectangle
    }
}
