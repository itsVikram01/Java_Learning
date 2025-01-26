package num;

import java.util.Scanner;

public class IntegerLastDigitInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : "); // 1234
        int n = sc.nextInt();
        sc.close();

        int l = n % 10;
        System.out.println("Last digit of no " + n + " is " + l);    // 4

        int count = 0;
        System.out.println("Count of no is : " + count); // 0
        while (n > 10) {
            count++;
            n = n / 10;
            System.out.println("After removing last digit, new no is : " + n); //123 12 1
            l = n % 10;
            System.out.println("Last digit of new no " + n + " is " + l);    // 3 2 1
        }
    }
}