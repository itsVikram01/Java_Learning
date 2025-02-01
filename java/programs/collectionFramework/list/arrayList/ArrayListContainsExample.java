package programs.collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListContainsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to find : ");
        int num = sc.nextInt();
        sc.close();

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(9);
        list.add(3);
        System.out.println(list);

        if (list.contains(num)) {
            System.out.println(num + " is found in the list");
        } else {
            System.out.println(num + " not found in the list");
        }
    }
}
