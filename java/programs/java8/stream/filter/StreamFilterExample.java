package programs.java8.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class StreamFilterExample {
    public static void main(String[] args) {
        String input = "aabbcdddfggggh";
        input = input.replaceAll("\\s", "");
        input = input.toLowerCase();

        //convert string into array considering each character as array element
        String[] strToArr = input.split("");

        //print string array
        out.println("strToArr : " + Arrays.toString(strToArr));

        // convert string array to stream and find character occurrence
        Map<String, List<String>> map = Arrays.stream(strToArr)
                .collect(Collectors.groupingBy(s -> s));
        out.println("map : " + map);

        // character occurrence count
        Map<String, Long> map1 = Arrays.stream(strToArr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        out.println("map1 : " + map1);

        //duplicate elements
        List<String> duplicate = map1.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        out.println("duplicate : " + duplicate);

        //non repeating element
        List<String> nonRepeat = map1.entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
        out.println("nonRepeat :" + nonRepeat);

        //first non-repeating element
        String firstNonRepeat = map1.entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().toString();
        out.println("firstNonRepeat : " + firstNonRepeat);

    }
}
