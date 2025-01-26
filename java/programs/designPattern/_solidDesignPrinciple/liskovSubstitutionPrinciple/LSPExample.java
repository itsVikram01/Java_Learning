package programs.designPattern._solidDesignPrinciple.liskovSubstitutionPrinciple;

import lombok.AllArgsConstructor;
import lombok.Data;

// Bad Example (violates LSP)
/*@Data
@AllArgsConstructor
class Rectangle {
    protected double width;
    protected double height;
}
class Square extends Rectangle {
    @Override
    public void setWidth(double side) {
        super.width = side;
        super.height = side;
    }
    @Override
    public void setHeight(double side) {
        super.width = side;
        super.height = side;
    }
}*/

@Data
@AllArgsConstructor
class Rectangle {
    protected double width;
    protected double height;

    public double getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double side) {
        super.width = side;
        super.height = side;
    }

    @Override
    public void setHeight(double side) {
        super.width = side;
        super.height = side;
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        // LSP violation demonstrated
        Square square = new Square(5);
        square.setWidth(7);
        System.out.println("Square Area (after setting width): " + square.getArea());
    }
}