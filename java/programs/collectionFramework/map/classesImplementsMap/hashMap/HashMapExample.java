package java.collectionFramework.map.classesImplementsMap.hashMap;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(3, "Banana");
        hm.put(1, "Cherry");
        hm.put(2, "Apple");

        // Get a value using a key
        System.out.println("Fruit at key 2: " + hm.get(2));

        // Check if a key exists
        System.out.println("HashMap contain key 4 : " + hm.containsKey(4));

        // Get all keys
        System.out.println("Keys in the HashMap: " + hm.keySet());

        // Get all values
        System.out.println("Values in the HashMap: " + hm.values());

        // Remove a key-value pair
        //hm.remove(1);

        // Print the updated HashMap
        System.out.println("Updated HashMap: " + hm);

        // sorted key
        /*Stream<Integer> sortedKeys = hm.keySet().stream().sorted();//.forEach(System.out::println);
        System.out.println(sortedKeys.toList());*/

        // sorted values
        /*Stream<String> sortedValues = hm.values().stream().sorted();//.forEach(System.out::println);
        System.out.println(sortedValues.toList());*/

        List<Integer> key = new ArrayList<>(hm.keySet());
        Collections.sort(key);
        System.out.println("Sorted Map by keys : " + key);

        System.out.println("Sorted Map by keys using java8 : ");
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey()));

        System.out.println("Sorted Map by values using java8 : ");
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getValue()));


        // Iterating or looping using entrySet() method
        System.out.println("Iterating or looping map using entrySet and enhanced for loop");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

    }
}
