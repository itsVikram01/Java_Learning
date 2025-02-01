package programs.collectionFramework.set;

import java.util.HashSet;

public class HashSetAddExample {
    public static void main(String[] args) {
        // initialize HashSet  
        HashSet<Integer> hs = new HashSet<Integer>();
        // add elements to HashSet object
        hs.add(3);
        hs.add(17);
        hs.add(6);
        hs.add(9);
        hs.add(7);
        System.out.println("Using Advanced For Loop");

        // printing HashSet 
        for (Integer num : hs) {
            System.out.println(num);
        }

    }
}