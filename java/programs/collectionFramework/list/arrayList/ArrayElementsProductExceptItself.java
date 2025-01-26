package java.collectionFramework.list.arrayList;

import java.util.Arrays;

public class ArrayElementsProductExceptItself {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Input array is : " + Arrays.toString(arr));

        int product = 1;
        for (int num : arr) {
            product = product * num;
        }
        System.out.println("Product of all elements: " + product);

        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = product / arr[i];
        }
        System.out.println("Array of product of all elements except itself is : " + Arrays.toString(result));

        /*int[] result = productExceptSelf(arr);
        System.out.println("Product of array elements except itself is : "+ Arrays.toString(result));*/ // prints [24, 12, 8, 6]
    }


    /*public static int[] productExceptSelf(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product = product * num;
        }
        System.out.println("Product of all elements: " + product);

        int[] result = new int[arr.length];
        Arrays.fill(result, 1);
        for (int i = 0; i < arr.length; i++) {
            result[i] = product / arr[i];
        }
        return result;
    }*/

    /*public static int[] productExceptSelf(int[] arr) {
        int product = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
        System.out.println("Product of all elements: " + product);

        int[] result = new int[arr.length];
        Arrays.fill(result, 1);
        for (int i = 0; i < arr.length; i++) {
            result[i] = product / arr[i];
        }
        return result;
    }*/
}
