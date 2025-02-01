package programs.collectionFramework.map.abstractMap.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ram");
        map.put(2, "Shyam");
        map.put(3, "Mohan");
        System.out.println("map : " + map);

        // 1.using for-each loop for iteration over Map.Entry & map.entrySet()
        System.out.println("using for-each loop for iteration over Map.Entry & map.entrySet()");
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 2.Iterating using iterators over Map.Entry<K, V> 
        System.out.println(" ");
        System.out.println("using iterator");
        Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 3.Iterating over keys or values using keySet() and values() methods
        System.out.println("Iterating over keys or values using keySet() and values() methods");
        // using keySet() for iteration over keys
        System.out.println("using keySet() for iteration over keys");
        for (Integer id : map.keySet()) {
            System.out.println("key: " + id);
        }
        // using values() for iteration over values
        System.out.println("using values() for iteration over values");
        for (String name : map.values()) {
            System.out.println("value: " + name);
        }

        // 4.Using forEach(action) method 
        // forEach(action) method to iterate map
        System.out.println(" ");
        System.out.println("forEach(action) method to iterate map");
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        // 5.Iterating over keys and searching for values (inefficient)
        System.out.println("Iterating over keys and searching for values (inefficient) ");
        for (Integer id : map.keySet()) {
            // search  for value
            String name = map.get(id);
            System.out.println("Key : " + id + ", Value : " + name);
        }

        // Iterating or looping using entrySet() method
        System.out.println("Iterating or looping map using entrySet and iterator()");
        Iterator<Entry<Integer, String>> entrySetIterator = map.entrySet().iterator();
        while (entrySetIterator.hasNext()) {
            Entry<Integer, String> entry = entrySetIterator.next();
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }
}
