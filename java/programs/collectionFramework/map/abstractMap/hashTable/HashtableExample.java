package java.collectionFramework.map.abstractMap.hashTable;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Cherry");
        ht.put(2, "Banana");
        ht.put(3, "Apple");

        // Get a value using a key
        String fruit = ht.get(2);
        System.out.println("Fruit at key 2: " + fruit);

        // Check if a key exists
        boolean containsKey = ht.containsKey(4);
        System.out.println("Does the Hashtable contain key 4? " + containsKey);

        // Get all keys
        System.out.println("Keys in the Hashtable: " + ht.keySet());

        // Get all values
        System.out.println("Values in the Hashtable: " + ht.values());

        // Remove a key-value pair
        ht.remove(1);

        // Print the updated Hashtable
        System.out.println("Updated Hashtable: " + ht);
    }
}
