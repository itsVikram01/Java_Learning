package programs;

import java.util.*;
import java.util.stream.Collectors;

public class MyArrayIntegerList {
    public static void main(String[] args) {

        /* int list */
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(5);
        intList.add(5);
        intList.add(6);
        intList.add(4);
        intList.add(4);
        System.out.println("intList : " + intList);

        /* occurrence of element */

        Map<Integer, Long> map = intList.stream()
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())); // Using LinkedHashMap to maintain insertion order

        System.out.println("intList elements counts : ");
        map.forEach((k, v) -> System.out.println(k + " : " + v));
        // Collectors.groupingBy using a HashMap internally for grouping.
        // In a HashMap, the iteration order of entries is not guaranteed to match the order of insertion from the intList.

        /* duplicate intList element */
        System.out.println("Duplicate intList element : ");
        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        /* first repeating element */
        System.out.println("First repeating element : ");
        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .skip(0)
                .findFirst()
                .ifPresent(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));


        /* unique intList element */
        System.out.println("Unique intList element : ");
        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        /* first unique element */
        System.out.println("First unique element : ");
        map.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .skip(0).findFirst().ifPresent(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        /* intList sorting */
        List<Integer> sortedList = intList.stream().sorted().toList();
        System.out.println("Sorted intList : " + sortedList);
        /*for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted intList : " + intList);*/

        /* intList reverse */
        /*Collections.reverse(intList);
        System.out.println("Reversed intList : " + intList);*/

        /*second-smallest element in intList*/
        intList.stream()
                .sorted()
                .distinct()
                .skip(1).findFirst().ifPresent(System.out::println);

        /*second-largest element in intList*/
        intList.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1).findFirst().ifPresent(System.out::println);

    }
}
