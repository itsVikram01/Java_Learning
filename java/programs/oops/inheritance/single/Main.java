package oops.inheritance.single;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.bark(); // Specific to Dog

        Animal a = new Animal();
        a.eat();
        //a.bark(); // Parent can't use child method
    }
}
