package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class MyArrayString {
    public static void main(String[] args) {
        /* String array */
        String[] strs = {"harsh", "harsh", "ash", "ash", "ash", "sea", "reds", "green"};

        Map<String, Long> stringCountMap = Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println("stringCountMap : " + stringCountMap);
        out.println(" ");

        /* filter and print */
        Arrays.stream(strs)
                .filter(str -> str.equals("harsh")
                        || str.startsWith("a")
                        || str.endsWith("d")
                        || str.length() == 4
                        || str.contains("n")
                ).forEach(System.out::println);
        out.println(" ");

        /* anagram */
        String[] strArr = {"abc", "bcd", "dca", "cab", "abd", "bcd"};
        int n = strArr.length;

        IntStream.range(0, n).forEach(i -> {
            IntStream.range(i + 1, n).forEach(j -> {

                String str1 = strArr[i];
                String str2 = strArr[j];

                if (str1.length() != str2.length()) {
                    System.out.println(str1 + " and " + str2 + " are not Anagram");
                } else {
                    int[] sortedChar1 = str1.chars().sorted().toArray();
                    int[] sortedChar2 = str2.chars().sorted().toArray();

                    boolean isAnagram = Arrays.equals(sortedChar1, sortedChar2);
                    System.out.println(str1 + " and " + str2 + (isAnagram ? " are Anagram" : " are not Anagram"));
                }

            });
        });

        /* Camel case convertor of string in array*/
        String[] array1 = Arrays.stream(strs)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(array1));


        String str = "HeLLo WoRLD";

        /* String characters count */
        Map<Character, Long> map = str.chars()
                .mapToObj(ch -> (char) ch) // Convert ASCII to Character
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);

        /* First duplicate character in string */
        System.out.println("First duplicate character in string : ");
        map.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .skip(0)
                .findFirst()
                .ifPresent(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        /* First unique character in string */
        System.out.println("First unique character in string : ");
        map.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .skip(0)
                .findFirst()
                .ifPresent(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        /* String char case convertor */
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                // If it's not an alphabet character, keep it unchanged
                sb.append(ch);
            }
        }
        System.out.println("Output: " + sb);

        // Reverse each word in String sentence using Java 8 Streams
        String output = Arrays.stream(str.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(output);

        /*IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> (char) c)
                .filter(c -> !str.contains(c.toString()))
                .forEach(c -> System.out.print(c + " "));*/

    }
}
