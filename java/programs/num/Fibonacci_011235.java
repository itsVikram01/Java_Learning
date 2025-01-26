package num;

public class Fibonacci_011235 {
    public static void main(String[] args) {
        int n = 10;

        int n1 = 0, n2 = 1, n3;
        System.out.println("The first terms of the Fibonacci sequence is : " + n1);
        System.out.println("The second terms of the Fibonacci sequence is : " + n2);

        System.out.println("The first " + n + " terms of the Fibonacci sequence are:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}