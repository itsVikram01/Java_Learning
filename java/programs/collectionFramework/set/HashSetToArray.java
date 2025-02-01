package programs.collectionFramework.set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {

        HashSet<String> hashset = new HashSet<>();
        hashset.add("Lawyer");
        hashset.add("Police");
        hashset.add("Doctor");
        hashset.add("Engineer");
        System.out.println("HashSet : " + hashset);

        // Creating an Array of HashSet size
        String[] array = new String[hashset.size()];

        // Converting HashSet to Array using toArray() method
        hashset.toArray(array);
        System.out.println("Array is: " + Arrays.toString(array));

        // Printing Array elements
        System.out.print("Array elements are : ");
        for (String str : array) {
            System.out.print(str);
            System.out.print(", ");
        }
    }
}