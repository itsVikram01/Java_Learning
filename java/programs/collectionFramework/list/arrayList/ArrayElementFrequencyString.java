package programs.collectionFramework.list.arrayList;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class ArrayElementFrequencyString {
    public static void main(String[] args) {
        String[] strs = {"arsh", "arsh", "ashwini", "ashwini", "ashwini", "sea", "red", "green"};

        Map<String, Integer> map = new HashMap<>();
        for (String str : strs) { // Iterate through the String array
            Integer count = map.get(str); // Get the current existing count for the string (could be null).
            if (count == null) { // Check if the string is new (count is null)
                count = 0; // Initialize the count to 0 for the new string
            }
            map.put(str, count + 1); // Increment the count for the string
        }
        map.forEach((key, value) -> out.println(key + ": " + value)); // Print the count of each string

        // OR

        /*Map<String, Long> stringCountMap = Arrays.stream(strs)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        stringCountMap.forEach((k, v) -> out.println(k + " : " + v));*/
    }
}
