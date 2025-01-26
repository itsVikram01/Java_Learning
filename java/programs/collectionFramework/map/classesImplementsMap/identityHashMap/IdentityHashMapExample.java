package java.collectionFramework.map.classesImplementsMap.identityHashMap;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        // Create two different objects with the same content
        String str1 = "Hello";
        String str2 = "Hello";

        // Create an IdentityHashMap
        Map<String, String> map = new IdentityHashMap<>();

        // Put the two objects into the map
        map.put(str1, "First String");
        map.put(str2, "Second String");

        // Output the map content
        System.out.println("IdentityHashMap: " + map);

        // Check if the two different objects are treated as equal
        System.out.println("str1 == str2: " + (str1 == str2)); // false (because they are different objects)
        System.out.println("map.size(): " + map.size()); // 2, because the keys are different objects in memory
    }
}

