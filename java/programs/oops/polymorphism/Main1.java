package programs.oops.polymorphism;

class Animal {

    // Animal static main() method
    public static void main(String[] args) {
        System.out.println("Animal static main(String[] args) method");
    }

    // makeSound() Method to be overridden
    public void makeSound() {
        System.out.println("Animal makeSound() method");
    }
}

class Parent extends Animal {
    // Data hiding of static main() method
    public static void main(String[] args) {
        System.out.println("Hiding Animal static main(String[] args) method with Parent static main(String[] args) method");
    }

    // Overloading main method
    public static void main(int[] args) {
        System.out.println("Overloading Parent static main(String[] args) method with Parent static main(int[] args)");
    }

    // Parent static display() method
    public static void display() {
        System.out.println("Parent class static display() method");
    }

    // Overriding
    @Override
    public void makeSound() {
        System.out.println("Overriding Animal makeSound() method with Parent makeSound() method");
    }
}

class Child extends Parent {
    // Method hiding (Static method can not override but its data hiding)
    public static void main(String[] args) {
        System.out.println("Hiding Parent static main(String[] args) method with Child static main(String[] args) method");
    }

    // Method hiding of Parent static display() method with Child static display() method
    public static void display() {
        System.out.println("Hiding Parent static display() method with Child static display() method");
    }

    // Overloading
    public static void main(Float[] args) {
        System.out.println("Overloading Parent static main(String[] args) method with Child static main(Float[] args)");
    }

    public static void main() {
        System.out.println("Overloading Child static main(float[] args) method with Child static main() ");
    }

    // Overriding
    @Override
    public void makeSound() {
        System.out.println("Overriding Parent makeSound() method with Child makeSound() method");
    }

}

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Main1 main method ");

        System.out.println();
        Parent parent = new Parent();
        Parent parentChild = new Child();
        Child child = new Child();
        /*Child childParent = new Parent();*/ // Child class reference variable referencing a Parent class object not possible
        Animal animal = new Animal();

        Parent.main(new String[0]); // Parent static main(String[] args) method
        Parent.main(new String[0]); // Parent static main(String[] args) method
        Parent.display(); // Parent class static display() method
        animal.makeSound(); // Animal makeSound() method

        //Overloading
        System.out.println();
        System.out.println("Overloading :");
        Parent.main(new int[0]); // Overloading Parent static main(String[] args) method with Parent static main(int[] args)
        Child.main(new Float[0]); // Overloading Parent static main(String[] args) method with Child static main(Float[] args)
        Child.main();   // Overloading Child static main(float[] args) method with Child static main()

        //Overriding
        System.out.println();
        System.out.println("Overriding :");
        parent.makeSound(); // Overriding Animal makeSound() method with Parent makeSound() method
        parentChild.makeSound(); // Overriding Parent makeSound() method with Child makeSound() method
        child.makeSound(); // Overriding Parent makeSound() method with Child makeSound() method

        // Method hiding using class name
        System.out.println();
        System.out.println("Method hiding using Class name :");
        Child.main(new String[0]);  // Hiding Parent static main(String[] args) method with Parent static main(String[] args) method
        Child.display(); // Hiding Parent static display() method with Child static display() method

        // Method hiding using object
        System.out.println();
        System.out.println("Method hiding using object :");
        Child.main(new String[0]); // Hiding Parent static main(String[] args) method with Parent static main(String[] args) method

    }
}