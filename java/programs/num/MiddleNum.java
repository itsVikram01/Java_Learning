package programs.num;

import java.util.Scanner;

public class MiddleNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int num = sc.nextInt();
        int temp = num;
        sc.close();

        int count = 0;
        while (temp > 10) {
            count++;
            temp = temp / 10;
        }
        System.out.println("Count : " + count);
        System.out.println(" ");

        while (num != 0) {
            if (count < 2) {
                System.out.println("Length of no should be 3 digit");
                return;
            }
            int length = count + 1;
            System.out.println("Length of num : " + length);

            int l = num % 10;
            System.out.println("Last digit of no " + num + " is " + l);

            num = num / 10;
            System.out.println("After removing last digit, no is : " + num);

            int posVal = (int) Math.pow(10, count - 1);

            if (length < 3) {
                System.out.println("Num should be 3 digit");
            }
            System.out.println("positionValue of new no is : " + posVal);
            int f = num / posVal;
            System.out.println("FirstDigit of no is : " + f);

            int middleNumber = num % posVal;
            System.out.println("middleNumber : " + middleNumber);

            System.out.println(" ");

            count--;
        }

        //System.out.println("middleNumber : " + middleNumber);
    }
}
