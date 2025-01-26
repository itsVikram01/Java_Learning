package programs.string;

import static java.lang.System.out;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abcba";
        int length = str.length();

        /* StringPalindromeWithoutReverseFunction */
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                out.println(str + " is not a palindrome.");
                break;
            }
        }
        out.println(str + " is a palindrome.");


        /* StringPalindromeWithReverseFunction */
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            out.println(str + " is a palindrome.");
        } else {
            out.println(str + " is not a palindrome.");
        }
    }
}