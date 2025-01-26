package num;

import java.util.Scanner;

public class IntegerLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : "); // 1234
        int num = sc.nextInt();
        sc.close();

        // int length = (int) Math.log10(num) + 1;
        int length = 0;
        while (num != 0) {
            length++;
            num /= 10;
        }
        System.out.println("Length of num : " + length);
    }
}