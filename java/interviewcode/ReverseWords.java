package interviewcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "I am vikram";

        // Reverse each word using Java 8 Streams
        String output = Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(output); // Output: "I ma markiv"
    }
}
