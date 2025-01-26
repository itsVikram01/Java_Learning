package java.collectionFramework.list.arrayList;

import java.util.Arrays;
import java.util.OptionalDouble;

import static java.lang.System.out;

public class ArraySecondSmallestAndSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5, 6, 7, 8, 9, 9};

        int smallest = Integer.MAX_VALUE;  // 2147483647
        int secondSmallest = Integer.MAX_VALUE; // 2147483647

        int largest = Integer.MIN_VALUE;    // -2147483648
        int secondLargest = Integer.MIN_VALUE;  // -2147483648

        for (int num : arr) {
            // Find smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

            // Find largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        out.println(smallest);
        out.println(secondSmallest);
        out.println(largest);
        out.println(secondLargest);

        /************************************** using java8 ***********************************************************/

        /*//int smallest = Arrays.stream(arr).boxed().min(Integer::compareTo).orElse(-1); // Get the minimum element
        //int secondSmallest = Arrays.stream(arr).boxed().sorted().distinct().skip(1).min(Integer::compareTo).orElse(-1);

        int smallest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> a-b) // sorted in descending order. without sorting, it is not possible to find
                .distinct()
                .skip(0)
                .findFirst()
                .orElse(-1);

        int secondSmallest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> a-b) // sorted in descending order. without sorting, it is not possible to find
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);

        int thirdSmallest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> a-b) // sorted in descending order. without sorting, it is not possible to find
                .distinct()
                .skip(2)
                .findFirst()
                .orElse(-1);

        //int largest = Arrays.stream(arr).boxed().max(Integer::compareTo).orElse(-1);
        //int secondLargest = Arrays.stream(arr).boxed().filter(i -> i != largest).max(Integer::compareTo).orElse(-1);
        //int secondLargest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(-1);

        int largest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> b-a) //  // sorted in ascending order. without sorting, it is not possible to find secondLargest
                .distinct()
                .skip(0)
                .findFirst()
                .orElse(-1);

        int secondLargest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> b-a) //  // sorted in ascending order. without sorting, it is not possible to find secondLargest
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);

        int thirdLargest = Arrays.stream(arr).boxed()
                .sorted((a,b) -> b-a) //  // sorted in ascending order. without sorting, it is not possible to find secondLargest
                .distinct()
                .skip(2)
                .findFirst()
                .orElse(-1);

        System.out.println(smallest);
        System.out.println(secondSmallest);
        System.out.println(thirdSmallest);
        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);*/


        OptionalDouble average = Arrays.stream(arr).average();
        out.println("Average of number is: " + average);
    }
}
