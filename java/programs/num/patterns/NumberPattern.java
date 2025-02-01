package programs.num.patterns;

import java.util.Scanner;

public class NumberPattern {
    /* No pattern in decreasing order */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(num);
        while (num > 1) {
            num = num / 10; // remove last digit
            System.out.println(num);
        }
    }
}