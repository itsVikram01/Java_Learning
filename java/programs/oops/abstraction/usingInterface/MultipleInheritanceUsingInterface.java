package oops.abstraction.usingInterface;

interface A {
    void sayHi();

    void hiSir();

    default void sayHello() {
        System.out.println("interface A : default void sayHello()");
    }
}

interface B extends A {
    @Override
    default void sayHello() {
        System.out.println("interface B extends A : default void sayHello()");
    }
}

interface C extends A {
    @Override
    default void sayHello() {
        System.out.println("interface C extends A : default void sayHello()");
    }
}

class WithoutAdapterClass implements A {
    // WithoutAdapterClass has to provide implementation for every abstract method of interface A
    @Override
    public void sayHi() {
        System.out.println("class WithoutAdapterClass implements A : public void sayHi()");
    }

    @Override
    public void hiSir() {
        System.out.println("class WithoutAdapterClass implements A : public void hiSir()");
    }
}

class WithoutAdapterClassImpl extends WithoutAdapterClass {
    @Override
    public void sayHi() {
        System.out.println("class WithoutAdapterClassImpl extends WithoutAdapterClass : public void sayHi()");
    }
}

class WithoutAdapterClass1 implements B, C {
    // WithoutAdapterClass1 has to provide implementation for every abstract method of interface A and default/static method of interface B, C.
    @Override
    public void sayHi() {
        System.out.println("class WithoutAdapterClass1 implements B, C : public void sayHi() ");
    }

    @Override
    public void hiSir() {
        System.out.println("class WithoutAdapterClass1 implements B, C : public void hiSir()");
    }

    @Override
    public void sayHello() {
        B.super.sayHello();
        C.super.sayHello();
    }
}

class WithoutAdapterClassImpl1 extends WithoutAdapterClass1 {
    @Override
    public void hiSir() {
        System.out.println("WithoutAdapterClassImpl1 extends WithoutAdapterClass1 : public void hiSir()");
    }
}


/* Adapter classes are often declared as abstract because they provide empty implementations.By making them abstract, Java ensures that instances of these classes cannot be directly created (since they don’t have meaningful behavior).*/
abstract class MyAdapterClass implements A {
    // MyAdapterClass has to provide empty implementation for every abstract method of interface A
    @Override
    public void sayHi() {
    }

    @Override
    public void hiSir() {
    }
}

class MyAdapterClassImpl extends MyAdapterClass {
    @Override
    public void sayHi() {
        System.out.println("class MyAdapterClassImpl extends MyAdapterClass : public void sayHi() ");
    }
}

abstract class MyAdapterClass1 implements B, C {
    // MyAdapterClass has to provide empty implementation for every abstract method of interface A and default/static method of interface B, C.
    @Override
    public void sayHi() {
    }

    @Override
    public void hiSir() {
    }

    @Override
    public void sayHello() {
        B.super.sayHello();
        C.super.sayHello();
    }
}

class MyAdapterClassImpl1 extends MyAdapterClass1 {
    @Override
    public void hiSir() {
        System.out.println("class MyAdapterClassImpl1 extends MyAdapterClass1 : public void hiSir() ");
    }
}


public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {

        WithoutAdapterClass withoutAdapter = new WithoutAdapterClass();
        withoutAdapter.sayHi(); // class WithoutAdapterClass implements A : public void sayHi()
        withoutAdapter.hiSir(); // class WithoutAdapterClass implements A : public void hiSir()
        withoutAdapter.sayHello(); // interface A : default void sayHello()

        System.out.println(" ");

        WithoutAdapterClassImpl withoutAdapterImpl = new WithoutAdapterClassImpl();
        withoutAdapterImpl.hiSir(); // class WithoutAdapterClass implements A : public void hiSir()
        withoutAdapterImpl.hiSir(); // class WithoutAdapterClass implements A : public void hiSir()
        withoutAdapterImpl.sayHello(); // interface A : default void sayHello()

        System.out.println(" ");

        WithoutAdapterClass1 withoutAdapter1 = new WithoutAdapterClass1();
        withoutAdapter1.sayHi(); // class WithoutAdapterClass1 implements B, C : public void sayHi()
        withoutAdapter1.hiSir(); // class WithoutAdapterClass1 implements B, C : public void hiSir()
        withoutAdapter1.sayHello();  /* interface B extends A : default void sayHello()
                                    interface C extends A : default void sayHello() */

        System.out.println(" ");

        WithoutAdapterClassImpl1 withoutAdapterImpl1 = new WithoutAdapterClassImpl1();
        withoutAdapterImpl1.sayHi(); // class WithoutAdapterClass1 implements B, C : public void sayHi()
        withoutAdapterImpl1.hiSir(); // WithoutAdapterClassImpl1 extends WithoutAdapterClass1 : public void hiSir()
        withoutAdapterImpl1.sayHello();  /* interface B extends A : default void sayHello()
                                    interface C extends A : default void sayHello() */

        System.out.println(" ");

        // MyAdapterClass myAdapter = new MyAdapterClass(); // 'MyAdapterClass' is abstract; cannot be instantiated
        // MyAdapterClass1 myAdapterClass1 = new MyAdapterClass1(); // 'MyAdapterClass1' is abstract; cannot be instantiated

        MyAdapterClassImpl myAdapter = new MyAdapterClassImpl();
        myAdapter.sayHi(); // class MyAdapterClassImpl extends MyAdapterClass : public void sayHi()
        // myAdapter.hiSir(); // empty implementation
        myAdapter.sayHello(); // interface A : default void sayHello()

        System.out.println(" ");

        MyAdapterClassImpl1 myAdapter1 = new MyAdapterClassImpl1();
        //myAdapter1.sayHi(); // empty implementation
        myAdapter1.hiSir(); // class MyAdapterClassImpl1 extends MyAdapterClass1 : public void hiSir()
        myAdapter1.sayHello();  /* interface B extends A : default void sayHello()
                                    interface C extends A : default void sayHello() */

    }
}
