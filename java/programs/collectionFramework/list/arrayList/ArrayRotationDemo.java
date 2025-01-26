package java.collectionFramework.list.arrayList;

import java.util.Arrays;

public class ArrayRotationDemo {
    public static void main(String[] args) {

        System.out.println(20 * 10 + "Mayank");
        System.out.println(20 / 10 + "Mayank");
        System.out.println(20 + 10 + "Mayank");
        System.out.println(20 - 10 + "Mayank");
        System.out.println(" ");
        System.out.println("Mayank" + 20 * 10);
        System.out.println("Mayank" + 20 / 10);
        System.out.println("Mayank" + 20 + 10);
        //System.out.println("Mayank"+20-10);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array is : " + Arrays.toString(arr));
        //7,6,5,4,3,2,1
        // 4,5,6,7,1,2,3

        int k = 3;

		/*int n = arr.length;
		for(int i=0; i<k; i++) {
			int l=arr[n-1];
			for(int j=n-1; j>0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=l;
		}
		System.out.println("Array after Rotation : "+Arrays.toString(arr));*/

		/*rotateRight(arr, k);
		System.out.println("rotateRight : "+Arrays.toString(arr));*/

        rotateLeft(arr, k);
        System.out.println("rotateLeft : " + Arrays.toString(arr));
    }

    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, (n - 1));
        reverse(arr, 0, (k) - 1);
        reverse(arr, (k), (n - 1));
    }

    private static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, (n - 1));
        reverse(arr, 0, (n - k) - 1);
        reverse(arr, (n - k), (n - 1));
    }

    private static void reverse(int[] arr, int i, int l) {
        while (i < l) {
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            i++;
            l--;
        }
    }
}
