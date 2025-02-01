package programs.dsa.dataStructures.set;

import java.util.HashSet;
import java.util.Set;

class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate element, will be ignored

        System.out.println("Set contains: " + set);

        // Checking if an element exists
        if (set.contains(20)) {
            System.out.println("Set contains 20");
        }

        // Removing an element
        set.remove(10);
        System.out.println("Set after removing 10: " + set);

        // Iterating through the set
        System.out.println("Elements in the set:");
        for (Integer element : set) {
            System.out.println(element);
        }

        // Set size
        System.out.println("Set size: " + set.size());
    }
}
