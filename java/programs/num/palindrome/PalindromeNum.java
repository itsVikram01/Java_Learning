package programs.num.palindrome;

import java.util.Scanner;

public class PalindromeNum {
    static int reverse = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : "); // 1234
        int num = sc.nextInt();
        sc.close();

        reverse = reverseNumber(num);
        System.out.println("reverseNumber : " + reverse);

        if (num == reverse) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    public static int reverseNumber(int num) {
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
}
