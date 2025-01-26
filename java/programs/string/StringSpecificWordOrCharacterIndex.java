package programs.string;

import static java.lang.System.out;

public class StringSpecificWordOrCharacterIndex {
    public static void main(String[] args) {
        String str = "Find the word 'word'";

        int firstIndex = str.indexOf("word");
        int lastIndex = str.lastIndexOf("word");

        /* index counting start from 0 to n */
        out.println(firstIndex); // Output: 5
        out.println(lastIndex); // Output: 15

        int firstIndex1 = str.indexOf("n");
        int lastIndex1 = str.lastIndexOf("r");

        out.println(firstIndex1); // Output: 2
        out.println(lastIndex1); // Output: 17
    }
}
