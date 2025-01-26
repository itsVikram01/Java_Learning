package java8.defaultAndStaticMethodInInterface;

@FunctionalInterface
interface MyFunctionalInterface {
    static void printInfo() {
        System.out.println("This is a functional interface");
    }

    void execute();
}

public interface StaticMethodImpl {
    static void main(String[] args) {
        MyFunctionalInterface.printInfo();
    }
}
