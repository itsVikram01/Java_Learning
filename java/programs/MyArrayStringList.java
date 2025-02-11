package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MyArrayStringList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("harsh");
        list.add("harsh");
        list.add("ash");
        list.add("ash");
        list.add("ash");
        list.add("sea");
        list.add("reds");
        list.add("green");

        System.out.println("String list : " + list);

        list.stream()
            /*.filter(str -> str.equals("harsh")
                    || str.startsWith("a")
                    || str.endsWith("d")
                    || str.length() == 4
                    || str.contains("n")
            )*/
            //.distinct()
            //.sorted() //a-z
            //.sorted(Comparator.naturalOrder()) //a-z
            //.sorted(Comparator.reverseOrder()) //z-a
            //.skip(1) // skip desired element from start
            //.findFirst().ifPresent(System.out::println);
            .forEach(System.out::println);

        /* anagram */
        List<String> strList = Arrays.asList("abc", "bcb", "ddc", "bac");
        int n = strList.size();

        /*IntStream.range(0, n).forEach(i -> {
            IntStream.range(0, n).forEach(j -> {
                String str1 = strList.get(i);
                String str2 = strList.get(j);

                if (str1.length() != str2.length()) {
                    System.out.println(str1 + " and " + str2 + " are not Anagram");
                } else {
                    int[] sortedChar1 = str1.chars().sorted().toArray();
                    int[] sortedChar2 = str2.chars().sorted().toArray();

                    boolean isAnagram = Arrays.equals(sortedChar1, sortedChar2);
                    System.out.println(str1 + " and " + str2 + (isAnagram ? " are Anagram" : " are not Anagram"));
                }

            });
        });*/


    }
}
