package programs.collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIterateOrTraverse {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(13);
        al.add(16);
        al.add(6);
        al.add(9);
        al.add(7);

        System.out.println("Using Advanced For Loop");
        for (Integer num : al) {
            System.out.println(num);
        }

        System.out.println("Using For Loop");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}