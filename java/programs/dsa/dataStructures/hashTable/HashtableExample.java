package java.dsa.dataStructures.hashTable;

import java.util.Hashtable;
import java.util.Map;

class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put("Apple", 50);
        hashtable.put("Banana", 30);
        hashtable.put("Cherry", 20);

        // Displaying the hashtable
        System.out.println("Hashtable: " + hashtable);

        // Accessing a value
        System.out.println("Price of Apple: " + hashtable.get("Apple"));

        // Checking if a key exists
        if (hashtable.containsKey("Banana")) {
            System.out.println("Banana exists in the hashtable");
        }

        // Removing a key-value pair
        hashtable.remove("Cherry");
        System.out.println("Hashtable after removing Cherry: " + hashtable);

        // Iterating through the hashtable
        System.out.println("Keys and values in the hashtable:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if hashtable is empty
        System.out.println("Is Hashtable empty? " + hashtable.isEmpty());
    }
}
