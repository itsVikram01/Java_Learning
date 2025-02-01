package programs.collectionFramework.map.abstractMap.hashMap;

import java.util.LinkedList;

public class HashMapInternalImpl<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private final LinkedList<Entry<K, V>>[] table;
    private int size;

    public HashMapInternalImpl() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    public static void main(String[] args) {
        HashMapInternalImpl<String, Integer> hashMapImpl = new HashMapInternalImpl<>();
        hashMapImpl.put(null, 0);
        hashMapImpl.put("apple", 1);
        hashMapImpl.put("banana", 2);
        hashMapImpl.put("orange", 3);
        hashMapImpl.put(null, 4);

        System.out.println("size : " + hashMapImpl.size()); // Output: 5
        System.out.println(hashMapImpl.get(null));
        System.out.println(hashMapImpl.get("apple")); // Output: 1
        System.out.println(hashMapImpl.get("banana")); // Output: 2
        System.out.println(hashMapImpl.get("orange")); // Output: 3
        System.out.println(hashMapImpl.remove("orange")); // Output: 3
        System.out.println(hashMapImpl.get("orange"));
        System.out.println(hashMapImpl.size()); // Output: 2
    }

    public int size() {
        return size;
    }

    private boolean keysAreEqual(K key1, K key2) {
        return key1 == null && key2 == null || key1 != null && key1.equals(key2);
    }

    public void put(K key, V value) {
        int hash = key == null ? 0 : key.hashCode();
        int index = hash & (table.length - 1);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        boolean keyFound = false;
        for (Entry<K, V> entry : table[index]) {
            if (keysAreEqual(key, entry.key)) {
                entry.value = value;
                keyFound = true;
                break;
            }
        }

        if (!keyFound) {
            table[index].add(new Entry<>(key, value));
            size++;
        }
    }

    public V get(K key) {
        int hash = key == null ? 0 : key.hashCode();
        int index = hash & (table.length - 1);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (keysAreEqual(key, entry.key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public V remove(K key) {
        int hash = key == null ? 0 : key.hashCode();
        int index = hash & (table.length - 1);

        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (keysAreEqual(key, entry.key)) {
                    V removedValue = entry.value;
                    table[index].remove(entry);
                    size--;
                    return removedValue;
                }
            }
        }
        return null;
    }

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}