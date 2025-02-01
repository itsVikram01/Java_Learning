package programs.num.permutation_combination;

import java.util.ArrayList;
import java.util.List;

public class PermutationAndCombination {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int r = 2;

        System.out.println("Permutations:");
        List<List<Integer>> permutations = getPermutations(nums, r);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }

        System.out.println("\nCombinations:");
        List<List<Integer>> combinations = getCombinations(nums, r);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> getPermutations(int[] nums, int r) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        List<Integer> current = new ArrayList<>();
        permute(nums, result, used, current, r);
        return result;
    }

    private static void permute(int[] nums, List<List<Integer>> result, boolean[] used, List<Integer> current, int r) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                permute(nums, result, used, current, r);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }

    public static List<List<Integer>> getCombinations(int[] nums, int r) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        combine(nums, result, current, 0, r);
        return result;
    }

    private static void combine(int[] nums, List<List<Integer>> result, List<Integer> current, int start, int r) {
        if (r == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            combine(nums, result, current, i + 1, r - 1);
            current.remove(current.size() - 1);
        }
    }
}
