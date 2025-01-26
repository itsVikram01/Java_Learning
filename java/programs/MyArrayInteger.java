package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MyArrayInteger {
    public static void main(String[] args) {
        /* array */
        //int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8, 7};
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr : " + Arrays.toString(arr));


        /* Array sorting */
        //Arrays.sort(arr);
        /*System.out.println(Arrays.toString(arr));
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        System.out.println("Sorted array : " + Arrays.toString(sortedArray));*/

        /* reverse array */
        //int n = arr.length;
        /*for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }*/
        /*IntStream.rangeClosed(0, n/2).boxed()
                .forEach(i -> {
                    int temp = arr[i];
                    arr[i] = arr[n-i-1];
                    arr[n-i-1] = temp;
                });
        System.out.println("Reversed array : " + Arrays.toString(arr));*/

        /* elements count */
        Map<Integer, Long> map1 = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
        System.out.println("array elements counts : ");
        map1.forEach((k, v) -> System.out.println(k + " : " + v));


        /* Array duplicate and unique */

        /* duplicate element */
        /*System.out.println("Duplicate array element : ");
        map1.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);*/
        /*map1.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });*/

        /* unique element */
        //System.out.println("Unique array element : ");
        /*map1.forEach((k, v) -> {
            if (v == 1) {
                System.out.println(k + " : " + v);
            }
        });*/

        /*Set<Integer> duplicate = new LinkedHashSet<>();
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            if (!unique.add(num)) {
                unique.remove(num);
                duplicate.add(num);
            }
        }
        System.out.println("Unique elements : " + unique);
        System.out.println("Repeating elements : " + duplicate);*/



        /* First repeating element :  */
        /*System.out.println("First repeating element : ");
        map1.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .skip(0).findFirst().ifPresent(entry -> System.out.println(entry.getKey());*/

        /* Most repeating element : mode */
        /*Arrays.stream(arr).boxed() // Convert int to Integer for Stream operations
                .collect(Collectors.groupingBy(num -> num, Collectors.counting())) // Group by element and count
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                //.max(Comparator.comparing(entry -> entry.getValue()))
                //.max(Comparator.comparing(Map.Entry::getValue))
                .stream().skip(0)
                .findFirst().ifPresent(entry -> System.out.println("max repeating key in the array = "+entry.getKey()));*/

        /* average/mean - (a1+a2+...an)/n  */
        OptionalDouble average = Arrays.stream(arr).average();
        int avg = Arrays.stream(arr).sum() / (arr.length);
        System.out.println(average + " : " + avg);

        /* median - ((n + 1)/2)th term if n is odd and (n/2)th term if n is even */              // Compute the average of the selected element(s)
        int n = arr.length;
        if (n == 0) {
            Arrays.stream(arr).filter(mid -> mid == arr[n / 2]).findFirst().ifPresent(System.out::println);
        } else {
            Arrays.stream(arr).filter(mid -> mid == (arr[n / 2] + arr[(n + 1) / 2]) / 2).findFirst().ifPresent(System.out::println);
        }


/************************************** smallest, secondSmallest, largest & secondLargest **********************************************/

        /*int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8};*/
        /* smallest */
        /*Arrays.stream(arr).boxed()
                .sorted((a, b) -> a - b) // sorted in descending order. without sorting, it is not possible to find
                .distinct()
                .skip(0)
                .findFirst().ifPresent(System.out::println);*/

        /* secondSmallest */
        /*Arrays.stream(arr).boxed()
                .sorted((a,b) -> a-b) // sorted in descending order. without sorting, it is not possible to find
                .distinct()
                .skip(1)
                .findFirst().ifPresent(System.out::println);*/

        /* largest */
        /*Arrays.stream(arr).boxed()
                .sorted((a, b) -> b - a) //  // sorted in ascending order. without sorting, it is not possible to find secondLargest
                .distinct()
                .skip(0)
                .findFirst().ifPresent(System.out::println);*/

        /* secondLargest */
        /*Arrays.stream(arr).boxed()
                .sorted((a,b) -> b-a) //  // sorted in ascending order. without sorting, it is not possible to find secondLargest
                .distinct()
                .skip(1)
                .findFirst().ifPresent(System.out::println);*/

        /************************************** Merge Array into List **********************************************/

        /*int[] arr1 = {3, 5, 1, 2, 4, 3};
        int[] arr2 = {1, 3, 4, 3, 2, 5};
        System.out.println("arr1 : "+ Arrays.toString(arr1));
        System.out.println("arr2 : "+ Arrays.toString(arr2));

        // Convert arrays to streams and merge them
        Stream<Integer> boxedArr1 = Arrays.stream(arr1).boxed();
        Stream<Integer> boxedArr2 = Arrays.stream(arr2).boxed();
        List<Integer> mergedList = Stream.concat(boxedArr1, boxedArr2).toList();
        System.out.println("mergedList : "+mergedList);*/

        // OR

        // convert array to list and merge
        /*List<Integer> mergedList = new ArrayList<>();
        for (int i : arr1) {
            mergedList.add(i);
        }
        for (int i : arr2) {
            mergedList.add(i);
        }
        System.out.println("mergedList : "+mergedList);*/

        // Sort the mergedList using stream
        /*mergedList = mergedList.stream().sorted().toList();
        System.out.println("sorted mergedList : "+mergedList);*/

        //Collections.sort(mergedList);
        //Collections.reverse(mergedList);

/************************************** Array Equality **********************************************/

        /*int[] arr1 = {3, 5, 1, 2, 4, 3};
        int[] arr2 = {1, 3, 4, 3, 2, 5};*/

        /*boolean areArraysEqual = IntStream.range(0, arr1.length)
                .allMatch(i -> Arrays.stream(arr2).anyMatch(j -> j == arr1[i]));
        if (areArraysEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }*/

        /*boolean areArraysEqual = true;
        if (arr1.length != arr2.length) {
            areArraysEqual = false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areArraysEqual = false;
                    break;
                }
            }
        }
        if (areArraysEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }*/

/************************************** sum of array elements **********************************************/

        /*int sum = 0;
        for (int num : arr)
            sum += num;
        System.out.println(sum);*/
    }
}
