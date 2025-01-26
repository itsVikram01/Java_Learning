package java.collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMergeAndSortAndReverse {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("3");
        List<String> list2 = new ArrayList<>();
        list2.add("4");
        list2.add("2");

        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println("Before sorting mergedList : " + mergedList);

        Collections.reverse(mergedList);
        System.out.println("After Reversing Before sorting mergedList : " + mergedList);

        Collections.sort(mergedList);
        System.out.println("After sorting mergedList : " + mergedList);

        Collections.reverse(mergedList);
        System.out.println("After Reversing After sorting mergedList : " + mergedList);
    }
}
