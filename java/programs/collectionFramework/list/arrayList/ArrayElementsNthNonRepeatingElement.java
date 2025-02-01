package programs.collectionFramework.list.arrayList;

import java.util.Arrays;

import static java.lang.System.out;

public class ArrayElementsNthNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 6, 7, 8, 9, 1, 3, 7, 8, 4};
        out.println(Arrays.toString(arr));

        /*int n = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
                if (count == n) {
                    out.println(n + "-th non-repeating element is : " + arr[i]);
                    return;
                }
            }
        }*/

        /*Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int n = 4;
        int count = 0;
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                count++;
                if (count == n) {
                    System.out.println(n + "-th non-repeating element is : " + num);
                    return;
                }
            }
        }*/

        /*Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for ( int num : arr){
                if (num == arr[i]){
                    counter++;
                }
            }
            if (counter == 1){
                set.add(arr[i]);
            }
            out.println(arr[i]+" : "+counter+", ");
        }
        out.println(set);
        out.println("2nd non repeating no is : " + set.stream().skip(1).findFirst());*/

        /*Set<Integer> set = new LinkedHashSet<>();
        int[] frequency = new int[arr.length];
        out.println(Arrays.toString(frequency));

        for (int num : arr) {
            frequency[num]++;
            if (frequency[num] == 1) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        out.println(set);
        out.println("2nd non repeating no is : " + set.stream().skip(1).findFirst());*/
    }
}
