package programs.collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMergeAndSortAndReverse {
    public static void main(String[] args) {

        int[] arr1 = {4, 5, 2, 6, 7, 8};
        int[] arr2 = {9, 1, 3, 7, 8};

        // sort array using Arrays in ascending order
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> mergedList = new ArrayList<>();
        for (int num : arr1) {
            mergedList.add(num);
        }
        for (int num : arr2) {
            mergedList.add(num);
        }
        System.out.println("Before sorting mergedList : " + mergedList);

        //mergedList.sort(Collections.reverseOrder()); // sort into reverse order
        Collections.reverse(mergedList); // reverse the merged list
        System.out.println("After Reversing Before sorting mergedList : " + mergedList);

        // sort arrayList using Collections in ascending order
        Collections.sort(mergedList);
        System.out.println("After sorting mergedList : " + mergedList);

        // reverse sorted arrayList using Collections in descending order
        //Collections.sort(arraylist, Collections.reverseOrder());
        mergedList.sort(Collections.reverseOrder()); // sort into reverse order
        System.out.println("After Reversing After sorting mergedList : " + mergedList);

    }

}
