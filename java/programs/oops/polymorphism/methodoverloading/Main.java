package oops.polymorphism.methodoverloading;

class Parent {
    public static void main(String[] args) {
        System.out.println("Parent main(String[] args)");
    }

    public static void main(int[] args) {
        System.out.println("Parent main(int[] args) overloading Parent main(String[] args)");
    }
}

class Child extends Parent {
    public static void main(float[] args) {
        System.out.println("Child main(float[] args)");
    }

    public static void main() {
        System.out.println("Child main() overloading Child main(float[] args)");
    }
}

public class Main {
    static {
        System.out.println("Main static block"); // 1. Main static block
    }

    public static void main(String[] args) {
        System.out.println("Main main(String[] args) method"); // 2. Main main(String[] args) method

        /* Overloading of main method */
        Parent parent = new Parent();
        Parent.main(new String[0]); // Parent main(String[] args)
        Parent.main(new int[0]); // Parent main(int[] args) overloading Parent main(String[] args)

        /* parent class object with parent class reference can't access child class methods */
        //parent.main(new float[0]);
        //parent.main();

        // Parent class reference variable referencing a Child class object
        Parent parent1 = new Child();
        Parent.main(new String[0]); // Parent main(String[] args)
        Parent.main(new int[0]); // Parent main(int[] args) overloading Parent main(String[] args)

        /* child class object with parent class reference can't access child class methods */
        //parent.main(new float[0]);
        //parent.main();

        // Child class reference variable referencing a Child class object
        Child child = new Child();
        Child.main(new float[0]); // Child main(float[] args)
        Child.main(); // Child main() overloading Child main(float[] args)

        /* child class object with child class reference can access parent methods */
        Parent.main(new String[0]); // Parent main(String[] args)
        Parent.main(new int[0]); // Parent main(int[] args) overloading Parent main(String[] args)

        // Child class reference variable referencing a Parent class object
        /*Child child1 = new Parent();*/ // Child class reference variable referencing a Parent class object not possible

    }
}