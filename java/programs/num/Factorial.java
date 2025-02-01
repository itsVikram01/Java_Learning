package programs.num;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        //long result = LongStream.rangeClosed(1, num).reduce(1, (x, y) -> x * y); // java 8 lambda expression

        int result = factorial(num);
        System.out.println(num + "! = " + result);
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1); // Recursive call for factorial
        }
    }
}
