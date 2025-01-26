package java.collectionFramework.list.arrayList;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {3, 5, 1, 2, 4, 3};
        int[] array2 = {1, 3, 4, 3, 2, 5};

        /*boolean areArraysEqual = IntStream.range(0, array1.length)
                .allMatch(i -> array1[i] == array2[i]);*/

        /*boolean areArraysEqual = true;

        if (array1.length != array2.length) {
            areArraysEqual = false;
        } else {
            // Sort both arrays
            Arrays.sort(array1);
            Arrays.sort(array2);

            // Compare sorted arrays
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areArraysEqual = false;
                    break;
                }
            }
        }*/

        /*boolean areArraysEqual = true;

        if (array1.length != array2.length) {
            areArraysEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                boolean found = false;
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    areArraysEqual = false;
                    break;
                }
            }
        }*/

        boolean areArraysEqual = IntStream.range(0, array1.length)
                .allMatch(i -> Arrays.stream(array2)
                        .anyMatch(j -> j == array1[i]));

        if (areArraysEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
    }
}
