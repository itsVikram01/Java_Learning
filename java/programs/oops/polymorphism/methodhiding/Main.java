package oops.polymorphism.methodhiding;

class Parent {

    // parent static method
    public static void printMessage() {
        System.out.println("This is the message from SuperClass Parent");
    }

    // parent static main method
    public static void main(String[] args) {
        System.out.println("Parent main method");
    }
}

class Child extends Parent {

    // Child static method hiding the parent static method
    public static void printMessage() {
        System.out.println("This is the message from SubClass Child");
    }

    // Child static main method hiding the parent static main method
    public static void main(String[] args) {
        System.out.println("Child main method");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main main method"); // Main main method

        // we can access static method and variable using Class name

        Parent.printMessage(); // This is the message from SuperClass Parent
        Parent.main(new String[0]); // Parent main method
        Child.printMessage(); // This is the message from SubClass Child
        Child.main(new String[0]); // Child main method

        // OR we can access static method and variable using object

        Parent superRef = new Parent(); // SuperClass object with SuperClass reference
        Parent.printMessage(); // This is the message from SuperClass
        Parent.main(new String[0]); // Parent main method

        Parent superRef2 = new Child(); // SubClass object with SuperClass reference
        Parent.printMessage(); // This is the message from SuperClass
        Parent.main(new String[0]); // Parent main method

        Child subRef = new Child(); // SubClass object with SubClass reference
        Child.printMessage();  // This is the message from SubClass Child
        Child.main(new String[0]); // Child main method


        //SubClass subRef2 = new Parent(); // SuperClass object with SubClass reference not possible

    }
}