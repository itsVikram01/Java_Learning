package programs.collectionFramework.list.vector;

import java.util.Enumeration;
import java.util.Vector;

/* It is a legacy class, originally part of Java 1.0, and is located in the java.util package.
A Vector is similar to an ArrayList, as both are dynamically resizable arrays. The key difference is that a Vector is synchronized, making it thread-safe. */
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        System.out.println("Vector after adding elements: " + vector);

        // Add element at a specific index
        vector.add(2, "Blueberry");
        System.out.println("Vector after adding 'Blueberry' at index 2: " + vector);

        // Remove an element by value
        vector.remove("Banana");
        System.out.println("Vector after removing 'Banana': " + vector);

        // Remove an element by index
        vector.remove(1);
        System.out.println("Vector after removing element at index 1: " + vector);

        // Check if an element exists
        System.out.println("Does the vector contain 'Apple'? " + vector.contains("Apple"));

        // Get an element by index
        System.out.println("Element at index 1: " + vector.get(1));

        // Update an element at a specific index
        vector.set(1, "Elderberry");
        System.out.println("Vector after updating index 1 to 'Elderberry': " + vector);

        // Get the size of the Vector
        System.out.println("Size of the Vector: " + vector.size());

        // Iterate using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Iterate using an Enumeration
        System.out.println("Iterating using Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Check if the Vector is empty
        System.out.println("Is the Vector empty? " + vector.isEmpty());

        // Clear all elements in the Vector
        vector.clear();
        System.out.println("Vector after clearing all elements: " + vector);

        // Check if the Vector is empty after clearing
        System.out.println("Is the Vector empty now? " + vector.isEmpty());
    }
}
