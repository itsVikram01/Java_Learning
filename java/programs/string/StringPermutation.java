package programs.string;

import java.util.stream.IntStream;

public class StringPermutation {

    public static void main(String[] args) {
        String s = "cat";
        printAllPermutations("", s);
    }

    // Function to display all permutations of the string str
    static void printAllPermutations(String prefix, String suffix) {
        if (suffix.isEmpty()) System.out.print(prefix + ", ");
        else {
            IntStream.range(0, suffix.length())
                    .forEach(i -> {
                        String left = suffix.substring(i, i + 1);
                        String right = suffix.substring(0, i) + suffix.substring(i + 1);
                        printAllPermutations(prefix + left, right);
                    });
        }
    }

}
