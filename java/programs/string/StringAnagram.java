package programs.string;

import java.util.Arrays;

import static java.lang.System.out;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            out.println(str1 + " and " + str2 + " are Anagram");
        } else {
            out.println(str1 + " and " + str2 + " are Not Anagram");
        }

    }
}
