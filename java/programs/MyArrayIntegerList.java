package programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MyArrayIntegerList {
    public static void main(String[] args) {

        /* array list */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(4);
        System.out.println("list" + list);

        // Collectors.groupingBy using a HashMap internally for grouping.
        // In a HashMap, the iteration order of entries is not guaranteed to match the order of insertion from the list.
/*
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())); // Using LinkedHashMap to maintain insertion order
*/
/*
        list.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));
*/

        /* occurrence of element */
/*
        System.out.println("arrayList elements counts : ");
        map.forEach((k, v) -> System.out.println(k + " : " + v));
*/

        /* first repeating  */
/*
        System.out.println("First repeating element : ");
        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .skip(0)
                .findFirst()
                .ifPresent(entry -> System.out.println(entry.getKey()));
*/
/*
        list.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .skip(0).findFirst()
                .ifPresent(entry -> System.out.println(entry.getKey()));
*/

/*
        System.out.println("Duplicate arrayList element : ");
        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
*/
        list.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

/*
        System.out.println("Unique arrayList element : ");
        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
*/

/*
        list.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
*/

        /* list sorting */
/*
        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println("Sorted arrayList : " + sortedList);
*/
//        list.stream().sorted().toList().forEach(System.out::println);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted list : " + list);


        /* list reverse */
/*
        Collections.reverse(list);
        System.out.println("Reversed arrayList : " + list);
*/

        list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().ifPresent(System.out::println);
        list.stream().sorted().distinct().skip(1).findFirst().ifPresent(System.out::println);

    }
}
