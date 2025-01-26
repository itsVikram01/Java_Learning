package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyOptionalClass {
    public static void main(String[] args) {
        String str = "Vikram kumar";
        Optional<String> optionalName = Optional.of(str);
        System.out.println(optionalName.orElse("null"));

        String emptyStr = null;
        Optional<String> optionalEmptyName = Optional.ofNullable(emptyStr);
        System.out.println(optionalEmptyName.orElse("adsafas"));

        str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.stream()
                .max(Integer::compareTo)
                .ifPresent(maxVal -> System.out.println("maxVal : " + maxVal));
        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(minVal -> System.out.println("minVal : " + minVal));


        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr)
                .max()
                .ifPresent(maxVal -> System.out.println("maxVal : " + maxVal));
        Arrays.stream(arr)
                .min()
                .ifPresent(minVal -> System.out.println("minVal : " + minVal));

        String[] str1 = {"Vikram", "Vikash"};
        System.out.println(str1[0]);

    }
}
