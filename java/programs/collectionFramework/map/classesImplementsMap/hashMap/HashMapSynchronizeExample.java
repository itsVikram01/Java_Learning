package java.collectionFramework.map.classesImplementsMap.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapSynchronizeExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> hashMap = new HashMap<>();

        // Synchronize the HashMap using Collections.synchronizedMap
        Map<String, String> synchronizedMap = Collections.synchronizedMap(hashMap);
        // Adding elements to the synchronized map
        synchronizedMap.put("1", "Apple");
        synchronizedMap.put("2", "Banana");
        synchronizedMap.put("3", "Cherry");

        // Accessing elements in a synchronized way
        synchronized (synchronizedMap) {
            for (Map.Entry<String, String> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        // Updating elements safely
        synchronized (synchronizedMap) {
            synchronizedMap.put("4", "Date");
            System.out.println("Added: 4 : Date");
        }

        // Accessing the updated map
        synchronized (synchronizedMap) {
            for (Map.Entry<String, String> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}