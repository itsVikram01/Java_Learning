package java.collectionFramework.list.arrayList;

import java.util.Arrays;
import java.util.Random;

public class ArrayElementSwitchAndRandomShuffle {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 0, 3, 0, 0, 0, 4, 0, 0, 0, 0};
        System.out.println(Arrays.toString(array));

        /*************************************** Element Switch *******************************************************/

        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != 0) {
                array[i] = array[j];
                i++;
            }
        }
        while (i < array.length) {
            array[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(array));

        /*************************************** Random Shuffle *******************************************************/

        Random rand = new Random();
        for (int num : array) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[num];
            array[num] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

}
