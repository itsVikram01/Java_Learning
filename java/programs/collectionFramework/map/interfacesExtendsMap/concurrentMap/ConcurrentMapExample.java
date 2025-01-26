package java.collectionFramework.map.interfacesExtendsMap.concurrentMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentMap using ConcurrentHashMap
        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Display the map
        System.out.println("Initial map: " + map);

        // Use putIfAbsent to add a key only if it is not already mapped
        map.putIfAbsent(2, "Blueberry");
        System.out.println("After putIfAbsent (key 2): " + map);

        // Use replace to replace a value for a given key
        map.replace(3, "Citrus");
        System.out.println("After replace (key 3): " + map);

        // Use remove to remove a key-value pair if the key exists
        map.remove(4, "Date");
        System.out.println("After remove (key 4): " + map);

        // Get a value for a specific key
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // Compute a new value based on the key using compute method
        map.compute(3, (key, oldValue) -> oldValue == null ? "Default" : oldValue + " Updated");
        System.out.println("After compute (key 3): " + map);

        // Compute if absent (only put the value if the key is absent)
        map.computeIfAbsent(5, key -> "Elderberry");
        System.out.println("After computeIfAbsent (key 5): " + map);

        // For each operation, it's guaranteed that multiple threads can safely perform these operations on the map
    }
}

