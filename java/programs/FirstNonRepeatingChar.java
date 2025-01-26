package programs;

import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "Starters";

        str.chars().boxed().collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

    }
}
