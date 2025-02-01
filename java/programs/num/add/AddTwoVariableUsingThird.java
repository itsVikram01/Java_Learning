package programs.num.add;

public class AddTwoVariableUsingThird {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("input a = " + a);
        int b = 20;
        System.out.println("input b = " + b);

        int c = a + b;
        System.out.println("c = " + c);

        a = c - a;
        System.out.println("output a = " + a);
        b = c - b;
        System.out.println("output b = " + b);

    }
}
