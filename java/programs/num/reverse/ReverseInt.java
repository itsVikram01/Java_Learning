package programs.num.reverse;


import static java.lang.System.out;

public class ReverseInt {
    public static void main(String[] args) {
        int num = 12345;
        /*int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("reverseNumber : "+reverse);*/

        String numStr = Integer.toString(num);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        out.println("reverseNumber : " + reversedStr);

    }
}
