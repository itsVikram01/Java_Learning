package programs.singletonClass;

public class LazySingleton {

    // Instance not created at the time of class loading
    private static LazySingleton instance;

    // Private constructor to prevent instantiation from other classes
    private LazySingleton() {
    }

    // Public method to provide access to the instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}