package programs.collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListElementRemoveAtIndex {
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(34);
        list2.add(45);
        list2.add(56);
        list2.add(25);
        list2.add(33);
        System.out.println("Integer ArrayList before remove method: ");
        for (Integer i : list2) {
            System.out.println(i);
        }

        list2.remove(1);
        list2.remove(0);
        System.out.println("Integer ArrayList after applying remove method: ");
        for (Integer i2 : list2) {
            System.out.println(i2);
        }


        List<String> list = new ArrayList<>();
        list.add("CC");
        list.add("AA");
        list.add("BB");
        list.add("DD");
        list.add("AA");
        list.add("ZZ");
        System.out.println("Given ArrayList before remove method: ");
        for (String str : list) {
            System.out.println(str);
        }

        list.remove(0);
        list.remove(2);
        list.remove(3);
        System.out.println("ArrayList after applying remove method: ");
        for (String str2 : list) {
            System.out.println(str2);
        }

		/*List<String> mergedList = new ArrayList<>(list);
		mergedList.add(list2.toString());

		System.out.println(mergedList);*/
    }
}