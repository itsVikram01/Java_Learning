package programs.num;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        sc.close();
        if (n % 2 == 0) {
            System.out.print("Number " + n + " is even.");
        } else {
            System.out.print("Number " + n + " is odd.");
        }

    }
}