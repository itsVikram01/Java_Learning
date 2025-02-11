package interviewcode;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        /*  Input: arr={1,2,-3,-5,4,-6,7}
            Output: [1,-3,2,-5,4,-6,7]  */

        int[] arr = {1, 2, -3, -5, 4, -6, 7};

        int evenIndex = 0;
        int oddIndex = 1;
        int[] result = new int[arr.length];
        for (int num : arr) {
            if (num > 0 && evenIndex < arr.length) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else if (num < 0 && oddIndex < arr.length) {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }

        System.out.println(Arrays.toString(result));
    }

}
