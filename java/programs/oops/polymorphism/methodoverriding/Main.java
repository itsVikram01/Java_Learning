package programs.oops.polymorphism.methodoverriding;

class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal class makeSound()");
    }
}

class Cat extends Animal {
    // Overridden method
    @Override
    public void makeSound() {
        System.out.println("Cat class makeSound() : Meow!");
    }
}

class Dog extends Animal {
    // Overridden method
    @Override
    public void makeSound() {
        System.out.println("Dog class makeSound() : Woof!");
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main class main(String[] args)");

        Animal animal = new Animal();
        animal.makeSound(); // Animal class makeSound()


        Animal animal2 = new Cat();
        animal2.makeSound(); // Cat class makeSound() : Meow!

        Animal animal3 = new Dog();
        animal3.makeSound(); // Dog class makeSound() : Woof!

        Cat cat = new Cat();
        cat.makeSound(); // Cat class makeSound() : Meow!

        //Cat cat2 = new Animal();
        //Cat cat2 = new Dog();

        Dog dog = new Dog();
        dog.makeSound(); // Dog class makeSound() : Woof!

        //Dog dog2 = new Animal();
        //Dog dog2 = new Cat();


    }
}
