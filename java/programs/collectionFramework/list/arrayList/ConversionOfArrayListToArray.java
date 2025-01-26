package java.collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionOfArrayListToArray {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pear");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Converting ArrayList to String array
        String[] fruitNames = fruits.toArray(new String[0]);
        System.out.println(Arrays.toString(fruitNames));

        // OR

        //Converting ArrayList to String array
		/*String[] fruitNames = new String[fruits.size()];
		int i = 0;
		for (String fruit : fruits) {
			fruitNames[i++] = fruit;
		}
		System.out.println(Arrays.toString(fruitNames));*/

        // OR

        //Converting ArrayList to String array using copyOf()
		/*String[] fruitNames = Arrays.copyOf(fruits.toArray(), fruits.size(), String[].class);
		System.out.println(Arrays.toString(fruitNames));*/

        for (String fruit : fruitNames) {
            System.out.println(fruit);
        }

    }
}
