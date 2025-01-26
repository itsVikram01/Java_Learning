package java17.enhancedPseudoNoGenerator;

import java.util.random.RandomGenerator;

public class RandomExample {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.of("Xoshiro256PlusPlus");
        System.out.println(generator.nextInt(100));  // Random number between 0-99
    }
}
