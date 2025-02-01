package programs.collectionFramework.list.arrayList.serialize_deserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

//In the output of deserialization, we are getting the same elements which are added to the 
//ArrayList during serialization.
public class ArrayListElementsDeserialization {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            FileInputStream fileIS = new FileInputStream("inputFile");
            ObjectInputStream objIS = new ObjectInputStream(fileIS);
            list = (List<String>) objIS.readObject();
            objIS.close();
            fileIS.close();
        } catch (IOException | ClassNotFoundException e) {
            e.fillInStackTrace();
        }
        // Printing the ArrayList
        for (String s : list) {
            System.out.println(s);
        }
    }
}