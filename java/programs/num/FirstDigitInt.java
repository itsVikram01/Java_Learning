package programs.num;

import java.util.Scanner;

public class FirstDigitInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Input num is : " + num);
        sc.close();

        // count the number of digits in the input number
        var length = (int) Math.log10(num) + 1;
        System.out.println("Length of no is : " + length);

        int positionValue = (int) Math.pow(10, length - 1);
        System.out.println("positionValue of no is : " + positionValue);

        // extract the first and last digits        
        int firstDigit = num / positionValue;
        System.out.println("FirstDigit of no is : " + firstDigit);
        int lastDigit = num % 10;
        System.out.println("LastDigit of no is : " + lastDigit);
    }
}
