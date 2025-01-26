package java.collectionFramework.list.arrayList.serialize_deserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

//We do not need to implement the Serializable interface in the below example because ArrayList
//is serialized by default.
public class ArrayListElementsSerialization {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("New York");
        list.add("Boston");
        list.add("Dallas");
        out.println(list);

        try {
            FileOutputStream fileOS = new FileOutputStream("inputFile");
            ObjectOutputStream objOS = new ObjectOutputStream(fileOS);
            objOS.writeObject(list);
            objOS.close();
            fileOS.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }

    }
}