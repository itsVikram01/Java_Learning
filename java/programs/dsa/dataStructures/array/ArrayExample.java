package programs.dsa.dataStructures.array;

public class ArrayExample {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 20, 30, 40};

        // Access elements using an index
        System.out.println("Element at index 0: " + array[0]);

        // Update an element
        array[2] = 50;
        System.out.println("Updated element at index 2: " + array[2]);

        // Traverse the array
        System.out.println("Array elements:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
