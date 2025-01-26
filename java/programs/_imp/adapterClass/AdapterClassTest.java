package java._imp.adapterClass;
/* Interface are collection of abstract methods and constant fields which are any Service Requirement Specification(SRS).
It does not provide implementation of any methods.
To define an interface in java we use "interface" keyword followed by interface name. */

interface MyInterface {
    int myConstant = 20; // public static final
    // but not abstract(because abstract is not applicable for variables)

    void m1(); // public and abstract

    void m2(); // public and abstract

    void m3(); // public and abstract
}


/* Adapter class is a class which provide empty implementation of every abstract method present in an interface. */
class AdapterClassExample implements MyInterface {
    @Override
    public void m1() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void m3() {
    }
}

class WithAdapterClass extends AdapterClassExample { // provide implementation of only required method.
    public void m1() {
        System.out.println("WithAdapterClass m1() implementation");
    }
}

class WithoutAdapterClass implements MyInterface { // provide implementation of every abstract method of MyInterface.
    public void m1() {
        System.out.println("m1() method impl");
    }

    public void m2() {
        System.out.println("m2() method impl");
    }

    public void m3() {
        System.out.println("m3() method impl");
    }
}

public class AdapterClassTest {
    public static void main(String[] args) {
        WithAdapterClass obj = new WithAdapterClass();
        obj.m1(); // WithAdapterClass m1() implementation
        obj.m2(); //
        obj.m3(); //

        WithoutAdapterClass obj2 = new WithoutAdapterClass();
        obj2.m1(); // m1() method impl
        obj2.m2(); // m2() method impl
        obj2.m3(); // m3() method impl
    }
}