package programs.java8.defaultAndStaticMethodInInterface;

interface MyInterface {
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in an interface");
    }

    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is the default method implementation");
    }

}

public class MyInterfaceImpl implements MyInterface {
    public static void main(String[] args) {
        MyInterfaceImpl obj = new MyInterfaceImpl();
        obj.abstractMethod();
        obj.defaultMethod();
        MyInterface.staticMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method");
    }

    // Can override default method if needed
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method");
    }

}
