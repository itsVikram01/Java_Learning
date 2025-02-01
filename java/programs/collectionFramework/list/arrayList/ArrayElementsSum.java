package programs.collectionFramework.list.arrayList;

import static java.lang.System.out;

public class ArrayElementsSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int num : array)
            sum += num;
        out.println(sum);
    }
}
