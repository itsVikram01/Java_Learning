package java.collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//ArrayList is non-synchronized and should not be used in multithreaded environment 
//without explicit synchronization.
public class ArrayListSynchronized {
    public static void main(String[] args) {

        // Converting ArrayList to Synchronized ArrayList
        List<String> synchronizedarraylist = Collections.synchronizedList(new ArrayList<>());
        synchronizedarraylist.add("Football");
        synchronizedarraylist.add("Basketball");
        synchronizedarraylist.add("Baseball");
        System.out.println(synchronizedarraylist);

        System.out.println("Synchronized ArrayList Iteration:");
        synchronized (synchronizedarraylist) {
            for (String s : synchronizedarraylist) {
                System.out.println(s);
            }
        }

        // Creating Synchronized ArrayList Object
        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
        al.add("Football");
        al.add("Basketball");
        al.add("Baseball");

        System.out.println("Showing synchronized CopyOnWriteArrayList Elements:");
        //Synchronized block is not required in this method
        for (String s : al) {
            System.out.println(s);
        }
    }
}