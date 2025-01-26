package java.collectionFramework.set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetContainsExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to find : ");
        int num = sc.nextInt();
        sc.close();
        // initialize HashSet  
        HashSet<Integer> hs = new HashSet<Integer>();
        // add elements to HashSet object
        hs.add(3);
        hs.add(17);
        hs.add(6);
        hs.add(9);
        hs.add(7);

        // check if HashSet contains element
        if (hs.contains(num)) {
            System.out.println(num + " was found in the list");
        } else {
            System.out.println(num + " was not found in the list");
        }

    }
}