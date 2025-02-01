package programs.num.swapno;


import static java.lang.System.out;

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {

        int num = 1234;

        // Calculate number of digits and position value (combined logic)
        int length = (int) Math.log10(num) + 1;
        out.println("Length of no is : " + length);
        int positionValue = (int) Math.pow(10, length - 1D);
        out.println("positionValue of no is : " + positionValue);

        // Extract first and last digits (combined logic)
        int firstDigit = num / positionValue;
        out.println("FirstDigit of no is : " + firstDigit);
        int lastDigit = num % 10;
        out.println("LastDigit of no is : " + lastDigit);

        // Swap the digits (combined logic)
        num = ((positionValue * lastDigit) + ((num - (positionValue * firstDigit)) - lastDigit + firstDigit));

        out.println("Number after swapping first and last digit: " + num);
    }

}

