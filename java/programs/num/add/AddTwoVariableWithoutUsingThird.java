package num.add;

public class AddTwoVariableWithoutUsingThird {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("input a = " + a);
        int b = 20;
        System.out.println("input b = " + b);

        b = a + b;
        System.out.println("sum a+b = " + b);

        a = b - a;
        System.out.println("output a = " + a);

        b = b - a;
        System.out.println("output b = " + b);
    }

}
