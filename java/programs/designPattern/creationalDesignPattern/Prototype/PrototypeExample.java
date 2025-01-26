package programs.designPattern.creationalDesignPattern.Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

// Prototype Interface
interface Prototype {
    Prototype clone();
}

// Concrete Prototype
@Data
@AllArgsConstructor
class Circle implements Prototype {
    private int radius;

    @Override
    public Circle clone() {
        return new Circle(this.radius);
    }
}

// Client
public class PrototypeExample {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(10);
        System.out.println("Original: " + originalCircle);

        Circle clonedCircle = originalCircle.clone();
        clonedCircle.setRadius(20);  // Modify the clone
        System.out.println("Cloned: " + clonedCircle);
        System.out.println("Original after modification: " + originalCircle);
    }
}

