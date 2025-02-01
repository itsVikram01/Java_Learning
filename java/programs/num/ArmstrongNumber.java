package programs.num;

public class ArmstrongNumber {
    /*It's a number that equals the sum of its digits, each raised to a power. For example, if you have a number like 153, it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153.*/
    public static void main(String[] args) {
        //int number = 1634; // 153;

        int number = 371, originalNumber, remainder, result = 0;
        int n = 4; // 3;

        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        if (result != number) {
            System.out.println(number + " is not an Armstrong number");
        } else {
            System.out.println(number + " is an Armstrong number");
        }

    }
}
