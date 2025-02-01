package programs.collectionFramework.list.arrayList;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.System.out;

public class ArrayDuplicateAndUniqueElements {
    public static void main(String[] args) {
        out.println(10 * 20 + "Javatpoint");    // 200Javapoint
        out.println("Javatpoint" + 10 * 20);  // Javapoint200


        int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};
        out.println(Arrays.toString(arr));

        Set<Integer> duplicateSet = new LinkedHashSet<>();
        Set<Integer> uniqueElementsSet = new LinkedHashSet<>();

        for (int num : arr) {
            if (!uniqueElementsSet.add(num)) {
                uniqueElementsSet.remove(num);
                duplicateSet.add(num);
            }
        }
        out.println(" ");
        out.println("Unique elements : " + uniqueElementsSet);
        out.println("Repeating elements : " + duplicateSet);

        // OR


        /*Arrays.sort(arr);
        out.println(Arrays.toString(arr));*/

        /*Map<Integer, Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));
        out.println(map);

        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();*/
        /*for (int key : map.keySet()) {
            if (map.get(key) <= 1) {
                uniqueList.add(key);
            }else {
                duplicateList.add(key);
            }
        }*/
        /*map.keySet().forEach(key -> {
            if (map.get(key) <= 1) {
                uniqueList.add(key);
            } else {
                duplicateList.add(key);
            }
        });
        out.println("Unique Elements in  Array : " + uniqueList);
        out.println("Duplicate Elements in  Array : " + duplicateList);*/
    }
}
