package programs.oops.polymorphism;
/*

class Animal {
    public void makeSound() { // makeSound() Method to be overridden
        System.out.println("Animal makeSound() method");
    }
    public static void main(String[] args) { // Animal static main() method
        System.out.println("Animal static main(String[] args) method");
    }
}

class Parent extends Animal {
    public static void main(String[] args) { // Method hiding of Animal class static main() method in Parent class
        System.out.println("Hiding Animal static main(String[] args) method with Parent static main(String[] args) method");
    }
    public static void main(int[] args) { // Overloading of static main() method is possible in same class
        System.out.println("Overloading Parent static main(String[] args) method with Parent static main(int[] args)");
    }
    @Override
    public void makeSound() { // Overriding
        System.out.println("Overriding Animal makeSound() method with Parent makeSound() method");
    }
    public static void display() { // Parent static display() method
        System.out.println("Parent class static display() method");
    }
}

class Child extends Parent {
    // Static method can not overrided but it can use concept method hiding
    public static void main(String[] args) { // Method hiding of Parent static main() method with Child static main() method
        System.out.println("Hiding Parent static main(String[] args) method with Child static main(String[] args) method");
    }
    public static void display() { // Method hiding of Parent static display() method with Child static display() method
        System.out.println("Hiding Parent static display() method with Child static display() method");
    }

    // Overloading of static main() method is possible in same class
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

public class Main {
    public static void main(String[] args) {
        System.out.println("Main main method ");

        System.out.println("");
        Parent parent = new Parent();
        Parent parentChild =new Child();
        Child child = new Child();
        */
/*Child childParent = new Parent();*//*
 // Child class reference variable referencing a Parent class object not possible
        Animal animal = new Animal();

        parent.main(new String[0]); // Parent static main(String[] args) method
        parentChild.main(new String[0]); // Parent static main(String[] args) method
        parentChild.display(); // Parent class static display() method
        animal.makeSound(); // Animal makeSound() method

        //Overloading
        System.out.println("");
        System.out.println("Overloading :");
        parent.main(new int[0]); // Overloading Parent static main(String[] args) method with Parent static main(int[] args)
        child.main(new Float[0]); // Overloading Parent static main(String[] args) method with Child static main(Float[] args)
        child.main();   // Overloading Child static main(float[] args) method with Child static main()

        //Overriding
        System.out.println("");
        System.out.println("Overriding :");
        parent.makeSound(); // Overriding Animal makeSound() method with Parent makeSound() method
        parentChild.makeSound(); // Overriding Parent makeSound() method with Child makeSound() method
        child.makeSound(); // Overriding Parent makeSound() method with Child makeSound() method

        // Method hiding using class name
        System.out.println("");
        System.out.println("Method hiding using Class name :");
        Child.main(new String[0]);  // Hiding Parent static main(String[] args) method with Parent static main(String[] args) method
        Child.display(); // Hiding Parent static display() method with Child static display() method

        // Method hiding using object
        System.out.println("");
        System.out.println("Method hiding using object :");
        child.main(new String[0]); // Hiding Parent static main(String[] args) method with Parent static main(String[] args) method

    }
}
*/
