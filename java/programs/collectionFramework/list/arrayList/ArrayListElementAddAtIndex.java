package programs.collectionFramework.list.arrayList;

import java.util.ArrayList;

public class ArrayListElementAddAtIndex {
    public static void main(String[] args) {
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(12);
        al2.add(32);
        al2.add(22);
        al2.add(42);
        System.out.println(al2);

        // Adding element to the 4th position
        // 4th position = 3rd index as index starts with 0
        al2.add(3, 36);
        System.out.println("ArrayList after adding Integer 36 : " + al2);

        // Addition of Integer element at 1st position i.e. 0th index
        al2.add(0, 48);

        // Displaying the ArrayList
        System.out.println("ArrayList after adding Integer 48 : " + al2);


        ArrayList<String> al = new ArrayList<>();
        al.add("California");
        al.add("Boston");
        al.add("San jose");
        al.add("New York");
        System.out.println(al);

        // Adding element to the 3rd position
        // 3rd position = 2 index as index starts with 0
        al.add(2, "San Francisco");
        System.out.println("ArrayList after adding String San Francisco : " + al);

        // Addition of String element at 1st position
        al.add(0, "Texas");

        // Displaying the ArrayList
        System.out.println("ArrayList after adding String Texas : " + al);
    }
}