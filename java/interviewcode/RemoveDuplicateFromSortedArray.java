package interviewcode;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int k = removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2; // Pointer to place the next allowed element

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) { // Allow at most two occurrences
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
