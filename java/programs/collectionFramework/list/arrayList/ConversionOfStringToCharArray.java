package programs.collectionFramework.list.arrayList;

import java.util.Arrays;

public class ConversionOfStringToCharArray {

    public static void main(String[] args) {
        String str = "Vikram kumar";
        System.out.println("Input String : " + str);
        
	    /*str = str.replaceAll("\\s", ""); // remove all whitespace characters
        System.out.println("String without whitespace : "+str);
        
	    str = str.toLowerCase();
        System.out.println("String in lowerCase : "+str);*/

        // Converting given string to char array 
        char[] charArray = str.toCharArray();
        System.out.println("Char array using Arrays : " + Arrays.toString(charArray));

        System.out.print("Char array : {");
        for (char c : charArray) {
            System.out.print(",");
            System.out.print("'" + c + "' ");
        }
        System.out.print("}");
    }
}
