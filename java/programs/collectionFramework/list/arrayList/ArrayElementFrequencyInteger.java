package java.collectionFramework.list.arrayList;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.out;

public class ArrayElementFrequencyInteger {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5, 5, 2, 1, 2, 3, 4, 6};

        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                out.println(arr[i - 1] + " -> " + count);
                count = 1;
            }
        }
        out.println(arr[arr.length - 1] + " -> " + count);

        /**************************************** Using Map ******************************************************/

        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        out.println(frequencyMap);

        /**************************************** Using java 8 ***************************************************/

        /*Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));
        System.out.println(frequencyMap);*/

        /**************************************** Using java 8 ***************************************************/


        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
                out.println(arr[i] + " -> " + count);
            }
        }*/
    }
}
