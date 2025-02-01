package programs.java8.functionalInterface.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Integer> doubler = (number) -> number * 2;

        int result = doubler.apply(5);
        System.out.println(result);

    }
}
