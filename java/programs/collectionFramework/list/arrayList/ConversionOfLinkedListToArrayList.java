package programs.collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConversionOfLinkedListToArrayList {
    public static void main(String[] args) {

        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Mango");
        linkedlist.add("Banana");
        linkedlist.add("Pear");
        linkedlist.add("Apple");
        linkedlist.add("Orange");
        System.out.println(linkedlist);

        // Converting LinkedList to ArrayList
        List<String> list = new ArrayList<>(linkedlist);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
