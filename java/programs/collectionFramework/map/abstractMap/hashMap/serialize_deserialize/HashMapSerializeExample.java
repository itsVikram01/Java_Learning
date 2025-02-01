package programs.collectionFramework.map.abstractMap.hashMap.serialize_deserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// HashMap class is serialized by default.
//It means HashMap class  does not need to implement Serializable interface in order to make it eligible for Serialization.
public class HashMapSerializeExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(3, "Value3");
        hashmap.put(4, "Value4");
        hashmap.put(5, "Value5");
        hashmap.put(1, "Value1");
        hashmap.put(2, "Value2");

        Map<Integer, String> map = Collections.synchronizedMap(hashmap);
        Set<Entry<Integer, String>> set = map.entrySet();
        synchronized (map) {
            for (Entry<Integer, String> pair : set) {
                System.out.print(pair.getKey() + ": ");
                System.out.println(pair.getValue());
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream("hashmap.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hashmap);
            oos.close();
            fos.close();
            System.out.println("Serialized HashMap data is saved in hashmap.ser");
        } catch (IOException ioe) {
            ioe.fillInStackTrace();
        }
    }
}