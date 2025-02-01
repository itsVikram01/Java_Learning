package programs.java8.defaultAndStaticMethodInInterface;

/*interface MyInterface1 {
    void existingMethod();
}*/

/*interface MyInterface2 {
    void existingMethod();
    void newMethod(); // This breaks all existing implementations!
}*/


interface MyInterface3 {
    void existingMethod();

    default void newMethod() {
        System.out.println("Default implementation of newMethod");
    }
}

class MyClass implements MyInterface3 {
    public void existingMethod() {
        System.out.println("Existing method implementation");
    }
}

public class DefaultMethodImpl {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.existingMethod(); // Works as before
        obj.newMethod();      // Uses the default implementation
    }
}
