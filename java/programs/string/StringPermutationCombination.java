package programs.string;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationCombination {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        int r = 2;

        System.out.println("Permutations:");
        List<List<String>> permutations = getPermutations(arr, r);
        for (List<String> permutation : permutations) {
            System.out.print(permutation + "  ");
        }

        System.out.println("\nCombinations:");
        List<List<String>> combinations = getCombinations(arr, r);
        for (List<String> combination : combinations) {
            System.out.print(combination + "  ");
        }
    }

    public static List<List<String>> getPermutations(String[] arr, int r) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        List<String> current = new ArrayList<>();
        permute(arr, result, used, current, r);
        return result;
    }

    private static void permute(String[] arr, List<List<String>> result, boolean[] used, List<String> current, int r) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(arr[i]);
                permute(arr, result, used, current, r);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }

    public static List<List<String>> getCombinations(String[] arr, int r) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        combine(arr, result, current, 0, r);
        return result;
    }

    private static void combine(String[] arr, List<List<String>> result, List<String> current, int start, int r) {
        if (r == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            combine(arr, result, current, i + 1, r - 1);
            current.remove(current.size() - 1);
        }
    }
}
