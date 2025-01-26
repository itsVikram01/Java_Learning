package programs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class MyArrayString {
    public static void main(String[] args) {
        /* String array */
        String[] strs = {"harsh", "harsh", "ash", "ash", "ash", "sea", "red", "green"};

        Map<String, Long> stringCountMap = Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println("stringCountMap : " + stringCountMap);
        out.println(" ");

        /* filter and print */
        Arrays.stream(strs)
                .filter(str -> str.equals("harsh")
                        || str.startsWith("a")
                        || str.endsWith("a")
                )
                .forEach(System.out::println);
        out.println(" ");

        out.println("String size is 3 and start with 'a' : ");
        Arrays.stream(strs)
                .filter(str -> str.length() == 3
                        && str.startsWith("a")
                )
                .forEach(System.out::println);
        //strs.stream().filter(str -> str.startWith('a') && str.length() ==3 ).forEach(System.out::println);
        out.println(" ");

        /* case convertor */
        String[] array1 = Arrays.stream(strs)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(array1));

        /* String  */
        String str = "HeLLo WoRLD";
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                // If it's not an alphabet character, keep it unchanged
                result.append(ch);
            }
        }
        System.out.println("Output: " + result);


        /*IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> (char) c)
                .filter(c -> !str.contains(c.toString()))
                .forEach(c -> System.out.print(c + " "));*/

        String[] strArr = {"abc", "bcb", "ddc", "bac"};
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                String str1 = strArr[i];
                String str2 = strArr[j];
                if (str1.length() != str2.length()) {
                    System.out.println(str1 + " and " + str2 + " are not anagram");
                }

                char[] arr1 = str1.toCharArray();
                char[] arr2 = str2.toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                if (Arrays.equals(arr1, arr2)) {
                    out.println(str1 + " and " + str2 + " are Anagram");

                } else {
                    out.println(str1 + " and " + str2 + " are not Anagram");
                }
            }
        }

    }
}
