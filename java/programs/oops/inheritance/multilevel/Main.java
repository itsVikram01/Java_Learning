package programs.oops.inheritance.multilevel;

public class Main {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.move();  // Inherited from Vehicle
        sc.honk();  // Inherited from Car
        sc.accelerate(); // Specific to SportsCar
    }
}
