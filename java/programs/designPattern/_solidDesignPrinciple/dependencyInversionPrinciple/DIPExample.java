package java.designPattern._solidDesignPrinciple.dependencyInversionPrinciple;

// Bad Example (violates DIP)
/*class Car {
    private Engine engine = new GasolineEngine();
    // ...
}
class GasolineEngine {
    // ...
}*/

interface Engine {
    void start();
}

class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}

class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gasoline engine started.");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started.");
    }
}

public class DIPExample {
    public static void main(String[] args) {
        // Use Gasoline Engine
        Engine gasolineEngine = new GasolineEngine();
        Car car1 = new Car(gasolineEngine);
        car1.start();

        // Use Electric Engine
        Engine electricEngine = new ElectricEngine();
        Car car2 = new Car(electricEngine);
        car2.start();
    }
}