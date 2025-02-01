package programs.collectionFramework.map.classesImplementsMap.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(0, "one");
        linkedHashMap.put(1, "Cherry");
        linkedHashMap.put(2, "Apple");
        linkedHashMap.put(3, "Banana");

        // Printing the LinkedHashMap (insertion order maintained)
        System.out.println("LinkedHashMap elements (insertion order):");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Accessing an element
        //System.out.println("\nAccessing key 2: " + linkedHashMap.get(2));

        // Updating the LinkedHashMap to maintain access order
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.putAll(linkedHashMap);
        System.out.println(".........." + accessOrderMap);

        // Access an element to update access order
        String s = accessOrderMap.get(0);// Access key 1
        System.out.println("Access order 1: " + s);

        // Printing the accessOrderMap (access order maintained). print the latest accessed element in last and will print according to their insertion order
        System.out.println("\nLinkedHashMap elements (access order):");
        for (Map.Entry<Integer, String> entry : accessOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
