package programs.string;

import static java.lang.System.out;

public class StringCharCountForSpecificChar {
    public static void main(String[] args) {
        String str = "Hello World";

        /* String contain specific character */
        char c = 'l';
        long count = str.chars().filter(ch -> ch == c).count();
        out.println(c + " : " + count);

        //OR

        /*int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(c + " : " + count);*/
    }
}
